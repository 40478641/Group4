package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        // Extract world information
        ArrayList<country> countrylist = a.getCountryList();
        ArrayList<country> countrycontinentlist = a.getcountrycontinentlist();
        ArrayList<country> countryregionlist = a.getcountryregionlist();
        ArrayList<country> countryworld10 = a.getcountryworldlimit10();
        ArrayList<country> countrycontinent10 = a.getcountrycontinentlimit10();
        ArrayList<country> countryregion10 = a.getcountryregionlimit10();
        ArrayList<city> cityworldlist = a.getcityworldlist();
        ArrayList<city> citycontinentlist = a.getcitycontinentlist();

        //Countries in the world organised by largest population to smallest.
        System.out.println("Country organised by largest population to smallest");
        a.printCountryList(countrylist);

        //Countries in a continent organised by largest population to smallest
        System.out.println("Countries in a continent organised by largest population to smallest");
        a.printcountrycontinentlist(countrycontinentlist);

        //countries in a region organised by largest population to smallest
        System.out.println("Countries in a region organised by largest population to smallest");
        a.printcountryregionlist(countryregionlist);

        //Top 10 populated countries in the world
        System.out.println("Top 10 populated countries in the world");
        a.printcountryworldlimit10(countryworld10);

        //Top 10 populated countries in a continent
        System.out.println("Top 10 Populated countries in Asia");
        a.printcountrycontinentlimit10(countrycontinent10);

        //Top 10 populated countries in a region
        System.out.println("Top 10 populated countries in Eastern Asia Region");
        a.printcountryregionlimit10(countryregion10);

        //Cities in the world organised by largest population to smallest
        System.out.println("Cities in the world organised by largest population to smallest");
        a.printcityworldlist(cityworldlist);

        //Cities in a continent organised by largest population to smallest
        System.out.println("Cities in a continent organised by largest population to smallest");
        a.printcitycontinentlist(citycontinentlist);


        // Disconnect from database
        a.disconnect();
    }

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(3000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
    //Countries in the world organised by largest population to smallest.
    public ArrayList<country> getCountryList()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<country> countrylist = new ArrayList<country>();
            while (rset.next())
            {
                country ctry = new country();
                ctry.Code = rset.getString("Code");
                ctry.Name = rset.getString("Name");
                ctry.Continent = rset.getString("Continent");
                ctry.Region = rset.getString("Region");
                ctry.Population = rset.getInt("Population");
                ctry.Capital = rset.getInt("Capital");
                countrylist.add(ctry);
            }
            return countrylist;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get salary details");
            return null;
        }
    }

    public void printCountryList(ArrayList<country> countrylist)
    {
        // Print header

        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (country ctry : countrylist)
        {
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            ctry.Code, ctry.Name, ctry.Continent, ctry.Region, ctry.Population, ctry.Capital);
            System.out.println(cty_string);
        }
    }
    //Countries in a continent organised by largest population to smallest
    public ArrayList<country> getcountrycontinentlist()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country WHERE Continent = 'Asia'"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<country> countrycontinentlist = new ArrayList<country>();
            while (rset.next())
            {
                country ctry = new country();
                ctry.Code = rset.getString("Code");
                ctry.Name = rset.getString("Name");
                ctry.Continent = rset.getString("Continent");
                ctry.Region = rset.getString("Region");
                ctry.Population = rset.getInt("Population");
                ctry.Capital = rset.getInt("Capital");
                countrycontinentlist.add(ctry);
            }
            return countrycontinentlist;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get countries details");
            return null;
        }
    }

    public void printcountrycontinentlist(ArrayList<country> countrycontinentlist)
    {
        // Print header

        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (country ctry : countrycontinentlist)
        {
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            ctry.Code, ctry.Name, ctry.Continent, ctry.Region, ctry.Population, ctry.Capital);
            System.out.println(cty_string);
        }
    }
    //countries in a region organised by largest population to smallest
    public ArrayList<country> getcountryregionlist()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country WHERE Region = 'Eastern Asia'"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<country> countryregionlist = new ArrayList<country>();
            while (rset.next())
            {
                country ctry = new country();
                ctry.Code = rset.getString("Code");
                ctry.Name = rset.getString("Name");
                ctry.Continent = rset.getString("Continent");
                ctry.Region = rset.getString("Region");
                ctry.Population = rset.getInt("Population");
                ctry.Capital = rset.getInt("Capital");
                countryregionlist.add(ctry);
            }
            return countryregionlist;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get salary details");
            return null;
        }
    }

    public void printcountryregionlist(ArrayList<country> countryregionlist)
    {
        // Print header

        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (country ctry : countryregionlist)
        {
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            ctry.Code, ctry.Name, ctry.Continent, ctry.Region, ctry.Population, ctry.Capital);
            System.out.println(cty_string);
        }
    }

    //Top 10 populated countries in the world
    public ArrayList<country> getcountryworldlimit10()
    {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC limit 10";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<country> countryworld10 = new ArrayList<country>();
            while (rset1.next())
            {
                country cty= new country();
                cty.Code=rset1.getString("Code");
                cty.Name=rset1.getString("Name");
                cty.Continent=rset1.getString("Continent");
                cty.Region=rset1.getString("Region");
                cty.Population=rset1.getInt("Population");
                cty.Capital=rset1.getInt("Capital");
                countryworld10.add(cty);
            }
            return countryworld10;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get world information");
        }
        return null;
    }

    public void printcountryworldlimit10(ArrayList<country> countryworld10)
    {
        // Print header
        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (country cty : countryworld10)
        {
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            cty.Code, cty.Name, cty.Continent, cty.Region, cty.Population, cty.Capital);
            System.out.println(cty_string);
        }
    }
    //Top 10 populated countries in a continent
    public ArrayList<country> getcountrycontinentlimit10()
    {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country WHERE Continent = 'Asia'"
                            + "ORDER BY Population DESC limit 10";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<country> countrycontinent10 = new ArrayList<country>();
            while (rset1.next())
            {
                country cty= new country();
                cty.Code=rset1.getString("Code");
                cty.Name=rset1.getString("Name");
                cty.Continent=rset1.getString("Continent");
                cty.Region=rset1.getString("Region");
                cty.Population=rset1.getInt("Population");
                cty.Capital=rset1.getInt("Capital");
                countrycontinent10.add(cty);
            }
            return countrycontinent10;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get world information");
        }
        return null;
    }

    public void printcountrycontinentlimit10(ArrayList<country> countrycontinent10)
    {
        // Print header
        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (country cty : countrycontinent10)
        {
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            cty.Code, cty.Name, cty.Continent, cty.Region, cty.Population, cty.Capital);
            System.out.println(cty_string);
        }
    }


    //Top 10 populated countries in a region
    public ArrayList<country> getcountryregionlimit10()
    {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country WHERE Region = 'Eastern Asia'"
                            + "ORDER BY Population DESC limit 10";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<country> countryregion10 = new ArrayList<country>();
            while (rset1.next())
            {
                country cty= new country();
                cty.Code=rset1.getString("Code");
                cty.Name=rset1.getString("Name");
                cty.Continent=rset1.getString("Continent");
                cty.Region=rset1.getString("Region");
                cty.Population=rset1.getInt("Population");
                cty.Capital=rset1.getInt("Capital");
                countryregion10.add(cty);
            }
            return countryregion10;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get world information");
        }
        return null;
    }

    public void printcountryregionlimit10(ArrayList<country> countryregion10)
    {
        // Print header
        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (country cty : countryregion10)
        {
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            cty.Code, cty.Name, cty.Continent, cty.Region, cty.Population, cty.Capital);
            System.out.println(cty_string);
        }
    }

    //Cities in the world organised by largest population to smallest
    public ArrayList<city> getcityworldlist()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Country, District, Population "
                            + "FROM city "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<city> cityworldlist = new ArrayList<city>();
            while (rset.next())
            {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.Country = rset.getString("Country");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                cityworldlist.add(ctry);
            }
            return cityworldlist;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city world details");
            return null;
        }
    }

    public void printcityworldlist(ArrayList<city> cityworldlist)
    {
        // Print header

        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "Country", "District", "Population"));
        // Loop over all countries in the list
        for (city ctry : cityworldlist)
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            ctry.Name, ctry.Country, ctry.District, ctry.Population);
            System.out.println(cty_string);
        }
    }


    //Cities in a continent organised by largest population to smallest
    public ArrayList<city> getcitycontinentlist()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.Country, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Continent = 'Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<city> citycontinentlist = new ArrayList<city>();
            while (rset.next())
            {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.Country = rset.getString("Country");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                citycontinentlist.add(ctry);
            }
            return citycontinentlist;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city continent details");
            return null;
        }
    }

    public void printcitycontinentlist(ArrayList<city> citycontinentlist)
    {
        // Print header

        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "Country", "District", "Population"));
        // Loop over all countries in the list
        for (city ctry : getcitycontinentlist())
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            ctry.Name, ctry.Country, ctry.District, ctry.Population);
            System.out.println(cty_string);
        }
    }

}
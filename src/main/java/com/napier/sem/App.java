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
        ArrayList<country> country10 = a.getcountrycontinentlimit10();

        // Country organised by largest population to smallest
        //System.out.println("Country organised by largest population to smallest");
        //a.printCountryList(countrylist);

        //Continent organised by largest population to smallest
        //System.out.println("Continent organised by largest population to smallest");
        //a.printCountryList(countrylist);



        //Continent Country Limit 10
        System.out.println("Continent Country Limit 10");
        a.printcountrycontinentlimit10(country10);

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


    public ArrayList<country> getcountrycontinentlimit10()
    {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create String for SQL statement
            System.out.println("Top 10 populated countries in a Asia Continent");
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country WHERE Continent = 'Asia'"
                            + "ORDER BY Population DESC limit 10";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<country> country10 = new ArrayList<country>();
            while (rset1.next())
            {
                country cty= new country();
                cty.Code=rset1.getString("Code");
                cty.Name=rset1.getString("Name");
                cty.Continent=rset1.getString("Continent");
                cty.Region=rset1.getString("Region");
                cty.Population=rset1.getInt("Population");
                cty.Capital=rset1.getInt("Capital");
                country10.add(cty);
            }
            return country10;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get world information");
        }
        return null;
    }

    public void printcountrycontinentlimit10(ArrayList<country> country10)
    {
        // Print header
        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (country cty : country10)
        {
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            cty.Code, cty.Name, cty.Continent, cty.Region, cty.Population, cty.Capital);
            System.out.println(cty_string);
        }
    }

}
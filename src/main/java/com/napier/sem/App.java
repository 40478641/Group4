package com.napier.sem;

import java.sql.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Create new Application
        App a = new App();

        // Connect to database
        if (args.length < 1) {
            a.connect("localhost:33060");
        } else {
            a.connect(args[0]);
        }

        // Extract world information
        ArrayList<country> countrylist = a.getCountryList();
        ArrayList<country> countrycontinentlist = a.getcountrycontinentlist();
        ArrayList<country> countryregionlist = a.getcountryregionlist();
        ArrayList<country> countryworld10 = a.getcountryworldlimit10();
        ArrayList<country> countrycontinent10 = a.getcountrycontinentlimit10();
        ArrayList<country> countryregion10 = a.getcountryregionlimit10();
        ArrayList<city> cityworldlist = a.getcityworldlist();
        ArrayList<city> citycontinentlist = a.getcitycontinentlist();
        ArrayList<city> cityregionlist = a.getcityregionlist();
        ArrayList<city> citycountrylist = a.getcitycountrylist();
        ArrayList<city> citydistrictlist = a.getcitydistrictlist();
        ArrayList<city> cityworldlimit10 = a.getcityworldlimit10();
        ArrayList<city> citycontinentlimit10 = a.getcitycontinentlimit10();
        ArrayList<city> cityregionlimit10 = a.getcityregionlimit10();
        ArrayList<city> citycountrylimit10 = a.getcitycountrylimit10();
        ArrayList<city> citydistrictlimit10 = a.getcitydistrictlimit10();
        ArrayList<city> capitallist = a.getcapitallist();
        ArrayList<city> capitalcontinentlist = a.getcapitalcontinentlist();
        ArrayList<city> CapitalRegionList = a.getCapitalRegionList();
        ArrayList<city> CapitalLimit10 = a.getCapitalLimit10();
        ArrayList<city> CapitalContinentLimit10 = a.getCapitalContinentLimit10();
        ArrayList<city> CapitalRegionLimit10 = a.getCapitalRegionLimit10();
        ArrayList<countrylanguage> languagelist = a.getlanguagelist();
        ArrayList<country> RegionPopulation = a.getRegionList();
        ArrayList<country> ContinentPopulation = a.getContinentPopulation();
        ArrayList<country> CountryPopulation = a.getCountryPopulation();
        ArrayList<city> DistrictPopulation=a.getDistrictPopulation();
        ArrayList<city> CityPopulation= a.getCityPopulation();
        ArrayList<country> WorldPopulation=a.getWorldPopulation();


        //Countries in the world organised by largest population to smallest.
        System.out.println("++++++++++++++++~ Country organised by largest population to smallest ~++++++++++++++++");
        a.printcountrylist(countrylist);

        //Countries in a continent organised by largest population to smallest
        System.out.println("++++++++++++++++~ Countries in a continent organised by largest population to smallest ~++++++++++++++++");
        a.printcountrylist(countrycontinentlist);

        //countries in a region organised by largest population to smallest
        System.out.println("++++++++++++++++~ Countries in a region organised by largest population to smallest ~++++++++++++++++");
        a.printcountrylist(countryregionlist);

        //Top 10 populated countries in the world
        System.out.println("++++++++++++++++~ Top 10 populated countries in the world ~++++++++++++++++~");
        a.printcountrylist(countryworld10);

        //Top 10 populated countries in a continent
        System.out.println("++++++++++++++++~ Top 10 Populated countries in Asia ~++++++++++++++++");
        a.printcountrylist(countrycontinent10);

        //Top 10 populated countries in a region
        System.out.println("++++++++++++++++~ Top 10 populated countries in Eastern Asia Region ~++++++++++++++++");
        a.printcountrylist(countryregion10);

        //Cities in the world organised by largest population to smallest
        System.out.println("++++++++++++++++~ Cities in the world organised by largest population to smallest ~++++++++++++++++");
        a.printcitylist(cityworldlist);

        //Cities in a continent organised by largest population to smallest
        System.out.println("++++++++++++++++~ Cities in a continent organised by largest population to smallest ~++++++++++++++++");
        a.printcitylist(citycontinentlist);

        //Cities in a region organised by largest population to smallest
        System.out.println("++++++++++++++++~ Cities in a region organised by largest population to smallest ~++++++++++++++++");
        a.printcitylist(cityregionlist);

        //Cities in a country organised by largest population to smallest
        System.out.println("++++++++++++++++~ Cities in a country organised by largest population to smallest ~++++++++++++++++");
        a.printcitylist(citycountrylist);

        //Cities in a district organised by largest population to smallest
        System.out.println("++++++++++++++++~ Cities in a district organised by largest population to smallest ~++++++++++++++++");
        a.printcitylist(citydistrictlist);

        //Top 10 populated cities in the world
        System.out.println("++++++++++++++++~ Top 10 populated cities in the world ~++++++++++++++++");
        a.printcitylist(cityworldlimit10);

        //Top 10 populated cities in a continent
        System.out.println("++++++++++++++++~ Top 10 populated cities in a continent ~++++++++++++++++");
        a.printcitylist(citycontinentlimit10);

        //Top 10 populated cities in a region
        System.out.println("++++++++++++++++~ Top 10 populated cities in a region ~++++++++++++++++");
        a.printcitylist(cityregionlimit10);

        //Top 10 populated cities in a country
        System.out.println("++++++++++++++++~ Top 10 populated cities in a country ~++++++++++++++++");
        a.printcitylist(citycountrylimit10);

        //Top 10 populated cities in a district
        System.out.println("++++++++++++++++~ Top 10 populated cities in a district ~++++++++++++++++");
        a.printcitylist(citydistrictlimit10);

        //Capital cities in the world organised by largest population to smallest
        System.out.println("++++++++++++++++ Capital cities in the world organised by largest population to smallest ++++++++++++++++");
        a.printcitylist(capitallist);

        //Capital cities in the continent organised by largest population to smallest
        System.out.println("++++++++++++++++ Capital cities in the world organised by largest population to smallest ++++++++++++++++");
        a.printcitylist(capitalcontinentlist);

        //Capital cities in the region organised by largest population to smallest
        System.out.println("++++++++++++++++ Capital cities in the region organised by largest population to smallest ++++++++++++++++");
        a.printcitylist(CapitalRegionList);

        //Top 10 populated capital cities in the world
        System.out.println("++++++++++++++++~ Top 10 populated capital cities in the world ~++++++++++++++++");
        a.printcitylist(CapitalLimit10);

        //Top 10 populated capital cities in a continent
        System.out.println("++++++++++++++++~ Top 10 populated capital cities in a continent ~++++++++++++++++");
        a.printcitylist(CapitalContinentLimit10);

        //Top 10 populated capital cities in a region
        System.out.println("++++++++++++++++~ Top 10 populated capital cities in a region ~++++++++++++++++");
        a.printcitylist(CapitalRegionLimit10);

        //Language from largest to smallest
        System.out.println(" ++++++++++++++++~ Country Language Largest to Smallest ~++++++++++++++++");
        a.printlanguagelist(languagelist);

        //Print population of a continent
        System.out.println(" \n  ++++++++++++++++++++++++++++++++The population of a Continnet +++++++++++++++++++++++++++ \n ");
        a.printPopulationContinent(ContinentPopulation);

        //The population of a region
        System.out.println(" \n ++++++++++++++++++++++++++++++++The population of a region+++++++++++++++++++++++++++ \n ");
        a.printPopulationRegion(RegionPopulation);

        //The population of a country
        System.out.println(" \n ++++++++++++++++++++++++++++++++The population of a Country +++++++++++++++++++++++++++ \n ");
        a.printPopulationCountry(CountryPopulation);

        //The population of a District
        System.out.println(" \n ++++++++++++++++++++++++++++++++The population of a District +++++++++++++++++++++++++++ \n ");
        a.printDistrictPopulation(DistrictPopulation);

        //The population of a City
        System.out.println(" \n ++++++++++++++++++++++++++++++++The population of a City +++++++++++++++++++++++++++ \n ");
        a.printCityPopulation(CityPopulation);

        //The population of World
        System.out.println(" \n ++++++++++++++++++++++++++++++++The population of World +++++++++++++++++++++++++++ \n ");
        a.printWorldPopulation(WorldPopulation);


        // Disconnect from database
        a.disconnect();
    }

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     *
     * @param
     */
    public void connect(String location) {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(3000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://" + location + "/world?allowPublicKeyRetrieval=true&useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */

    public void disconnect() {
        if (con != null) {
            try {
                // Close connection
                con.close();
            } catch (Exception e) {
                System.out.println("Error closing connection to database");
            }
        }
    }

    //Countries in the world organised by largest population to smallest.
    public ArrayList<country> getCountryList() {
        try {
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
            while (rset.next()) {
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Countries in the world organised by largest population to smallest");
            return null;
        }
    }

    //Countries in a continent organised by largest population to smallest
    public ArrayList<country> getcountrycontinentlist() {
        try {
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
            while (rset.next()) {
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Countries in a continent organised by largest population to smallest");
            return null;
        }
    }

    //countries in a region organised by largest population to smallest
    public ArrayList<country> getcountryregionlist() {
        try {
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
            while (rset.next()) {
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get countries in a region organised by largest population to smallest");
            return null;
        }
    }

    //Top 10 populated countries in the world
    public ArrayList<country> getcountryworldlimit10() {
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
            while (rset1.next()) {
                country cty = new country();
                cty.Code = rset1.getString("Code");
                cty.Name = rset1.getString("Name");
                cty.Continent = rset1.getString("Continent");
                cty.Region = rset1.getString("Region");
                cty.Population = rset1.getInt("Population");
                cty.Capital = rset1.getInt("Capital");
                countryworld10.add(cty);
            }
            return countryworld10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top 10 populated countries in the world");
        }
        return null;
    }

    //Top 10 populated countries in a continent
    public ArrayList<country> getcountrycontinentlimit10() {
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
            while (rset1.next()) {
                country cty = new country();
                cty.Code = rset1.getString("Code");
                cty.Name = rset1.getString("Name");
                cty.Continent = rset1.getString("Continent");
                cty.Region = rset1.getString("Region");
                cty.Population = rset1.getInt("Population");
                cty.Capital = rset1.getInt("Capital");
                countrycontinent10.add(cty);
            }
            return countrycontinent10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top 10 populated countries in a continent");
        }
        return null;
    }

    //Top 10 populated countries in a region
    public ArrayList<country> getcountryregionlimit10() {
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
            while (rset1.next()) {
                country cty = new country();
                cty.Code = rset1.getString("Code");
                cty.Name = rset1.getString("Name");
                cty.Continent = rset1.getString("Continent");
                cty.Region = rset1.getString("Region");
                cty.Population = rset1.getInt("Population");
                cty.Capital = rset1.getInt("Capital");
                countryregion10.add(cty);
            }
            return countryregion10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top 10 populated countries in a region");
        }
        return null;
    }

    //Cities in the world organised by largest population to smallest
    public ArrayList<city> getcityworldlist() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "ORDER BY Population DESC ";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<city> cityworldlist = new ArrayList<city>();
            while (rset1.next()) {
                city cty = new city();
                cty.Name = rset1.getString("Name");
                cty.CountryCode = rset1.getString("CountryCode");
                cty.District = rset1.getString("District");
                cty.Population = rset1.getInt("Population");
                cityworldlist.add(cty);
            }
            return cityworldlist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Cities in the world organised by largest population to smallest");
        }
        return null;
    }

    //Cities in a continent organised by largest population to smallest
    public ArrayList<city> getcitycontinentlist() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Continent = 'Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<city> citycontinentlist = new ArrayList<city>();
            while (rset.next()) {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.CountryCode = rset.getString("CountryCode");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                citycontinentlist.add(ctry);
            }
            return citycontinentlist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Cities in a continent organised by largest population to smallest");
            return null;
        }
    }

    //Cities in a region organised by largest population to smallest
    public ArrayList<city> getcityregionlist() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Region = 'Eastern Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> cityregionlist = new ArrayList<city>();
            while (rset.next()) {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.CountryCode = rset.getString("CountryCode");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                cityregionlist.add(ctry);
            }
            return cityregionlist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    //Cities in a country organised by largest population to smallest
    public ArrayList<city> getcitycountrylist() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Name = 'China'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> citycountrylist = new ArrayList<city>();
            while (rset.next()) {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.CountryCode = rset.getString("CountryCode");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                citycountrylist.add(ctry);
            }
            return citycountrylist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    //Cities in a district organised by largest population to smallest
    public ArrayList<city> getcitydistrictlist() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND city.District = 'Kabol'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> citydistrictlist = new ArrayList<city>();
            while (rset.next()) {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.CountryCode = rset.getString("CountryCode");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                citydistrictlist.add(ctry);
            }
            return citydistrictlist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    //Top 10 populated cities in the world
    public ArrayList<city> getcityworldlimit10() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "ORDER BY Population DESC limit 10 ";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> cityworldlimit10 = new ArrayList<city>();
            while (rset1.next()) {
                city cty = new city();
                cty.Name = rset1.getString("Name");
                cty.CountryCode = rset1.getString("CountryCode");
                cty.District = rset1.getString("District");
                cty.Population = rset1.getInt("Population");
                cityworldlimit10.add(cty);
            }
            return cityworldlimit10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city information");
        }
        return null;
    }

    //Top 10 populated cities in a continent
    public ArrayList<city> getcitycontinentlimit10() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Continent = 'Asia'"
                            + "ORDER BY city.Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<city> citycontinentlimit10 = new ArrayList<city>();
            while (rset.next()) {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.CountryCode = rset.getString("CountryCode");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                citycontinentlimit10.add(ctry);
            }
            return citycontinentlimit10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city continent details");
            return null;
        }
    }

    //Top 10 populated cities in a region
    public ArrayList<city> getcityregionlimit10() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Region = 'Eastern Asia'"
                            + "ORDER BY city.Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> cityregionlimit10 = new ArrayList<city>();
            while (rset.next()) {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.CountryCode = rset.getString("CountryCode");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                cityregionlimit10.add(ctry);
            }
            return cityregionlimit10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    //Top 10 populated cities in a country
    public ArrayList<city> getcitycountrylimit10() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Name = 'China'"
                            + "ORDER BY city.Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> citycountrylimit10 = new ArrayList<city>();
            while (rset.next()) {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.CountryCode = rset.getString("CountryCode");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                citycountrylimit10.add(ctry);
            }
            return citycountrylimit10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    //Top 10 populated cities in a district
    public ArrayList<city> getcitydistrictlimit10() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND city.District = 'Kabol'"
                            + "ORDER BY city.Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> citydistrictlimit10 = new ArrayList<city>();
            while (rset.next()) {
                city ctry = new city();
                ctry.Name = rset.getString("Name");
                ctry.CountryCode = rset.getString("CountryCode");
                ctry.District = rset.getString("District");
                ctry.Population = rset.getInt("Population");
                citydistrictlimit10.add(ctry);
            }
            return citydistrictlimit10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    //Capital cities in the world organised by largest population to smallest
    public ArrayList<city> getcapitallist() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID,country.Capital,city.Name,country.Code,city.CountryCode,city.District,country.Name,city.Population"
                            + " FROM city, country Where country.Capital = city.ID and city.CountryCode = country.Code"
                            + " ORDER BY Population desc";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> capitallist = new ArrayList<city>();
            while (rset1.next()) {
                city cty = new city();
                cty.Name = rset1.getString("Name");
                cty.CountryCode = rset1.getString("CountryCode");
                cty.District = rset1.getString("District");
                cty.Population = rset1.getInt("Population");
                capitallist.add(cty);
            }
            return capitallist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital cities information");
        }
        return null;
    }

    //Capital cities in the continent organised by largest population to smallest

    public ArrayList<city> getcapitalcontinentlist() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID,country.Capital,city.Name,country.Code,city.CountryCode,city.District,country.Name,city.Population"
                            + " FROM city, country Where country.Capital = city.ID and city.CountryCode = country.Code AND country.Continent = 'Asia'"
                            + " ORDER BY Population desc";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> capitalcontinentlist = new ArrayList<city>();
            while (rset1.next()) {
                city cty = new city();
                cty.Name = rset1.getString("Name");
                cty.CountryCode = rset1.getString("CountryCode");
                cty.District = rset1.getString("District");
                cty.Population = rset1.getInt("Population");
                capitalcontinentlist.add(cty);
            }
            return capitalcontinentlist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital cities information in Asia");
        }
        return null;
    }

    //Capital cities in the region organised by largest population to smallest

    public ArrayList<city> getCapitalRegionList() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID,country.Capital,city.Name,country.Code,city.CountryCode,city.District,country.Name,city.Population"
                            + " FROM city, country Where country.Capital = city.ID and city.CountryCode = country.Code AND country.Region = 'Eastern Asia'"
                            + " ORDER BY Population desc";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> CapitalRegionList = new ArrayList<city>();
            while (rset1.next()) {
                city cty = new city();
                cty.Name = rset1.getString("Name");
                cty.CountryCode = rset1.getString("CountryCode");
                cty.District = rset1.getString("District");
                cty.Population = rset1.getInt("Population");
                CapitalRegionList.add(cty);
            }
            return CapitalRegionList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital cities information in Eastern Asia");
        }
        return null;
    }

    //Top 10 populated Capital cities in the world
    public ArrayList<city> getCapitalLimit10() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID,city.Name,city.CountryCode,city.District,city.Population,country.Capital,country.Code,country.Name,country.Continent"
                            + " FROM city, country Where city.ID = country.Capital"
                            + " ORDER BY city.Population desc limit 10";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> CapitalLimit10 = new ArrayList<city>();
            while (rset1.next()) {
                city cty = new city();
                cty.Name = rset1.getString("Name");
                cty.CountryCode = rset1.getString("CountryCode");
                cty.District = rset1.getString("District");
                cty.Population = rset1.getInt("Population");
                CapitalLimit10.add(cty);
            }
            return CapitalLimit10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top capital cities  information");
        }
        return null;
    }

    //Top 10 populated Capital cities in a Continent
    public ArrayList<city> getCapitalContinentLimit10() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID,country.Capital,city.Name,country.Code,city.CountryCode,city.District,country.Name,city.Population"
                            + " FROM city, country Where country.Capital = city.ID and city.CountryCode = country.Code  AND country.Continent = 'Asia'"
                            + " ORDER BY Population desc limit 10";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> CapitalContinentLimit10 = new ArrayList<city>();
            while (rset1.next()) {
                city cty = new city();
                cty.Name = rset1.getString("Name");
                cty.CountryCode = rset1.getString("CountryCode");
                cty.District = rset1.getString("District");
                cty.Population = rset1.getInt("Population");
                CapitalContinentLimit10.add(cty);
            }
            return CapitalContinentLimit10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top capital cities  information");
        }
        return null;
    }

    //Top 10 populated Capital cities in a Region
    public ArrayList<city> getCapitalRegionLimit10() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.ID,country.Capital,city.Name,country.Code,city.District,city.CountryCode,country.Name,city.Population"
                            + " FROM city, country Where country.Capital = city.ID and city.CountryCode = country.Code AND country.Region = 'Eastern Asia'"
                            + " ORDER BY Population desc limit 10";
            ResultSet rset1 = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> CapitalRegionLimit10 = new ArrayList<city>();
            while (rset1.next()) {
                city cty = new city();
                cty.Name = rset1.getString("Name");
                cty.CountryCode = rset1.getString("CountryCode");
                cty.District = rset1.getString("District");
                cty.Population = rset1.getInt("Population");
                CapitalRegionLimit10.add(cty);
            }
            return CapitalRegionLimit10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top capital cities list information in Eastern Asia");
        }
        return null;
    }

    //The Population of a World !
    public ArrayList<country> getWorldPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population) FROM country";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<country> WorldPopulation = new ArrayList<country>();
            while (rset.next()) {
                country wl = new country();
                wl.Population = (int) rset.getLong("SUM(Population)");
                WorldPopulation.add(wl);
            }
            return WorldPopulation;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get World population");
            return null;
        }
    }

    //The Population of a Continent !
    public ArrayList<country> getContinentPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population),Continent FROM country WHERE Continent='Europe'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<country> continents = new ArrayList<country>();
            while (rset.next()) {
                country cont = new country();
                cont.Continent = rset.getString("Continent");
                cont.Population = (int) rset.getLong("SUM(Population)");
                continents.add(cont);
            }
            return continents;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get continent population");
            return null;
        }
    }

    //The population of a region
    public ArrayList<country> getRegionList() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population), Region FROM country WHERE Region='Eastern Asia'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<country> regions = new ArrayList<country>();
            while (rset.next()) {
                country regs = new country();
                regs.Region = rset.getString("Region");
                regs.Population = (int) rset.getLong("SUM(Population)");
                regions.add(regs);
            }
            return regions;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    //The Population of a Country !
    public ArrayList<country> getCountryPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population),Name FROM country WHERE Name='Singapore'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<country> country = new ArrayList<country>();
            while (rset.next()) {
                country cunt = new country();
                cunt.Name = rset.getString("Name");
                cunt.Population = (int) rset.getLong("SUM(Population)");
                country.add(cunt);
            }
            return country;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country Population");
            return null;
        }
    }

    //The Population of district !
    public ArrayList<city> getDistrictPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population),District FROM city WHERE District = 'Kabol'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> District = new ArrayList<city>();
            while (rset.next()) {
                city dis = new city();
                dis.District = rset.getString("District");
                dis.Population = (int) rset.getLong("SUM(Population)");
                District.add(dis);
            }
            return District;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get District Population");
            return null;
        }
    }

    //The Population of City !
    public ArrayList<city> getCityPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population),Name FROM city WHERE Name = 'Seoul'";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<city> CityPopulation = new ArrayList<city>();
            while (rset.next()) {
                city cty1 = new city();
                cty1.Name = rset.getString("Name");
                cty1.Population = (int) rset.getLong("SUM(Population)");
                CityPopulation.add(cty1);
            }
            return CityPopulation;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City Population");
            return null;
        }
    }

    //Languages from greatest number to smallest
    public ArrayList<countrylanguage> getlanguagelist() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT COUNT(CountryCode), Language FROM countrylanguage GROUP BY Language ORDER By COUNT(CountryCode) DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<countrylanguage> languagelist = new ArrayList<countrylanguage>();
            while (rset.next()) {
                countrylanguage clg = new countrylanguage();
                clg.CountryCode = rset.getString("COUNT(CountryCode)");
                clg.Language = rset.getString("Language");
                languagelist.add(clg);
            }
            return languagelist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Language detail");
            return null;
        }
    }


    //Print All of Country Ouput
    public void printcountrylist(ArrayList<country> countrylist) {
        // Check country is not null
        if (countrylist == null) {
            System.out.println("No Country Information");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (country ctry : countrylist) {
            if (ctry == null)
                continue;
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            ctry.Code, ctry.Name, ctry.Continent, ctry.Region, ctry.Population, ctry.Capital);
            System.out.println(cty_string);
        }
    }

    //Print All of City Output
    public void printcitylist(ArrayList<city> citylist) {
        // Check city is not null
        if (citylist == null) {
            System.out.println("No Country Information");
            return;
        }
        // Print header

        System.out.println(String.format("%-25s %-25s %-35s %25s", "Name", "CountryCode", "District", "Population"));
        // Loop over all countries in the list
        for (city ctry : citylist) {
            if (ctry == null)
                continue;
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            ctry.Name, ctry.CountryCode, ctry.District, ctry.Population);
            System.out.println(cty_string);
        }

    }

    //Print population of world
    public void printWorldPopulation(ArrayList<country> WorldPopulation) {
        if (WorldPopulation == null) {
            System.out.println("No data!!");
            return;
        }
        for (country cont : WorldPopulation) {
            System.out.println("The population of World => " + " : " + cont.Population);
        }
    }

    //Print population of a continent
    public void printPopulationContinent(ArrayList<country> continents) {
        if (continents == null) {
            System.out.println("No data!!");
            return;
        }
        for (country cont : continents) {
            System.out.println("The population of Continent => " + cont.Continent + " : " + cont.Population);
        }
    }

    //Print population of a region
    public void printPopulationRegion(ArrayList<country> regions) {
        if (regions == null) {
            System.out.println("No data!!");
            return;
        }
        for (country reg : regions) {
            System.out.println("The population of Region => " + reg.Region + " : " + reg.Population);
        }
    }

    //Print population of a country
    public void printPopulationCountry(ArrayList<country> country) {
        if (country == null) {
            System.out.println("No data!!");
            return;
        }
        for (country cunt : country) {
            System.out.println("The population of Country => " + cunt.Name + " : " + cunt.Population);
        }

    }

    //Print population of a District
    public void printDistrictPopulation(ArrayList<city> District) {
        if (District == null) {
            System.out.println("No data!!");
            return;
        }
        for (city dis : District) {
            System.out.println("The population of District => " + dis.District + " : " + dis.Population);
        }
    }

    //Print population of a City
    public void printCityPopulation(ArrayList<city> CityPopulation) {
        if (CityPopulation == null) {
            System.out.println("No data!!");
            return;
        }
        for (city cty1 : CityPopulation) {
            System.out.println("The population of City => " + cty1.Name + " : " + cty1.Population);
        }
    }

    //Print All of Language Output
    public void printlanguagelist(ArrayList<countrylanguage> languagelist) {
        // Check language is not null
        if (languagelist == null) {
            System.out.println("No Language Information");
            return;
        }
        // Print header

        System.out.println(String.format("%-35s %25s", "CountryCode", "Language"));
        // Loop over all countries in the list
        for (countrylanguage clg : languagelist) {
            if (clg == null)
                continue;
            String cty_string =
                    String.format("%-35s %25s",
                            clg.CountryCode, clg.Language);
            System.out.println(cty_string);
        }
    }


}
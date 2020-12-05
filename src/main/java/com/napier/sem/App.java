package com.napier.sem;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws SQLException {
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
        ArrayList<population> livingnoncontinent = a.getlivingnoncontinent();
        ArrayList<population> livingnonregion = a.getlivingnonregion();
        ArrayList<population> livingnoncountry = a.getlivingnoncountry();


        //Countries in the world organised by largest population to smallest.
        System.out.println(" \n ++++++++++++++++ 1.  Country organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcountrylist(countrylist);

        //Countries in a continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 2.  Countries in a continent organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcountrylist(countrycontinentlist);

        //countries in a region organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 3. Countries in a region organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcountrylist(countryregionlist);

        //Top 10 populated countries in the world
        System.out.println(" \n ++++++++++++++++ 4. Top 10 populated countries in the world ++++++++++++++++ \n ");
        a.printcountrylist(countryworld10);

        //Top 10 populated countries in a continent
        System.out.println(" \n ++++++++++++++++ 5. Top 10 Populated countries in Asia  ++++++++++++++++ \n ");
        a.printcountrylist(countrycontinent10);

        //Top 10 populated countries in a region
        System.out.println(" \n ++++++++++++++++ 6.  Top 10 populated countries in Eastern Asia Region ++++++++++++++++ \n ");
        a.printcountrylist(countryregion10);

        //Cities in the world organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 7.  Cities in the world organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcitylist(cityworldlist);

        //Cities in a continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 8. Cities in a continent organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcitylist(citycontinentlist);

        //Cities in a region organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 9. Cities in a region organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcitylist(cityregionlist);

        //Cities in a country organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 10. Cities in a country organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcitylist(citycountrylist);

        //Cities in a district organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 11. Cities in a district organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcitylist(citydistrictlist);

        //Top 10 populated cities in the world
        System.out.println(" \n ++++++++++++++++ 12.  Top 10 populated cities in the world ++++++++++++++++ \n ");
        a.printcitylist(cityworldlimit10);

        //Top 10 populated cities in a continent
        System.out.println(" \n ++++++++++++++++ 13. Top 10 populated cities in a continent ++++++++++++++++ \n ");
        a.printcitylist(citycontinentlimit10);

        //Top 10 populated cities in a region
        System.out.println(" \n ++++++++++++++++ 14.  Top 10 populated cities in a region ++++++++++++++++ \n ");
        a.printcitylist(cityregionlimit10);

        //Top 10 populated cities in a country
        System.out.println(" \n ++++++++++++++++ 15. Top 10 populated cities in a country ++++++++++++++++ \n ");
        a.printcitylist(citycountrylimit10);

        //Top 10 populated cities in a district
        System.out.println(" \n ++++++++++++++++ 16. Top 10 populated cities in a district ++++++++++++++++ \n ");
        a.printcitylist(citydistrictlimit10);

        //Capital cities in the world organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 17. Capital cities in the world organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcitylist(capitallist);

        //Capital cities in the continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 18. Capital cities in the world organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcitylist(capitalcontinentlist);

        //Capital cities in the region organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 19. Capital cities in the region organised by largest population to smallest ++++++++++++++++ \n ");
        a.printcitylist(CapitalRegionList);

        //Top 10 populated capital cities in the world
        System.out.println(" \n ++++++++++++++++ 20. Top 10 populated capital cities in the world ++++++++++++++++ \n ");
        a.printcitylist(CapitalLimit10);

        //Top 10 populated capital cities in a continent
        System.out.println(" \n ++++++++++++++++ 21. Top 10 populated capital cities in a continent ++++++++++++++++ \n ");
        a.printcitylist(CapitalContinentLimit10);

        //Top 10 populated capital cities in a region
        System.out.println(" \n ++++++++++++++++ 22. Top 10 populated capital cities in a region ++++++++++++++++ \n ");
        a.printcitylist(CapitalRegionLimit10);

        //Living and non-living population of continent
        System.out.println(" \n ++++++++++++++++ 23. Living and Non-Living Population of Continents ++++++++++++++++ \n ");
        a.pringlivingnoncontinent(livingnoncontinent);

        //Living and non-living population of regions
        System.out.println(" \n ++++++++++++++++ 24. Living and Non-Living Population of Regions ++++++++++++++++ \n ");
        a.pringlivingnonregion(livingnonregion);

        //Living and non-living population of countries
        System.out.println(" \n ++++++++++++++++ 25. Living and Non-Living Population of Country ++++++++++++++++ \n");
        a.pringlivingnoncountry(livingnoncountry);

        //The population of World
        System.out.println(" \n ++++++++++++++++ 26. The population of World ++++++++++++++++ \n ");
        a.printWorldPopulation(WorldPopulation);


        //Print population of a continent
        System.out.println(" \n ++++++++++++++++ 27. The population of a Continnet ++++++++++++++++ \n ");
        a.printPopulationContinent(ContinentPopulation);

        //The population of a region
        System.out.println(" \n ++++++++++++++++ 28. The population of a region ++++++++++++++++ \n ");
        a.printPopulationRegion(RegionPopulation);

        //The population of a country
        System.out.println(" \n ++++++++++++++++ 29. The population of a Country ++++++++++++++++ \n ");
        a.printPopulationCountry(CountryPopulation);

        //The population of a District
        System.out.println(" \n ++++++++++++++++ 30. The population of a District ++++++++++++++++ \n ");
        a.printDistrictPopulation(DistrictPopulation);

        //The population of a City
        System.out.println(" \n ++++++++++++++++ 31. The population of a City ++++++++++++++++ \n ");
        a.printCityPopulation(CityPopulation);

        //Language from largest to smallest
        System.out.println(" \n ++++++++++++++++ 32. Country Language Largest to Smallest ++++++++++++++++ \n ");
        a.printlanguagelist(languagelist);




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
            // Extract cities information
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
            // Extract Capital information
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
            // Extract Capital information
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
            // Extract Capital information
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

    //The Population of World !
    public ArrayList<country> getWorldPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population) FROM country";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract World information
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
            // Extract Continent information
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
            // Extract region information
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
            // Extract Country information
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
            // Extract district information
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
            // Extract Languages information
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


    //Living and non-living population of continents
    public ArrayList<population> getlivingnoncontinent() throws SQLException {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT COUNT(Name), Continent FROM country GROUP BY Continent ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Languages information
            ArrayList<population> livingnoncontinent = new ArrayList<population>();
            ArrayList<String> livingnonnamecon = new ArrayList<String>();
            while (rset.next()) {
                livingnonnamecon.add(rset.getString("Continent"));
            }
            for(String eachcondetail:livingnonnamecon){
                population conpop1 =  new population();
                ArrayList<String> livingnonname = new ArrayList<String>();
                BigInteger total = new BigInteger("0");
                BigInteger popcity = new BigInteger("0");
                conpop1.name = eachcondetail;
                String totalpop = "SELECT Code, Population FROM country WHERE Continent = '" + eachcondetail +"'";
                ResultSet rset1 = stmt.executeQuery(totalpop);
                while (rset1.next())
                {
                    livingnonname.add(rset1.getString("Code"));
                    int total1 = rset1.getInt("Population");
                    BigInteger total2 = BigInteger.valueOf(total1);
                    total = total.add(total2);
                }
                for(String eachcodecou: livingnonname){
                    String strSelect1 = "SELECT sum(Population) as popcity FROM city WHERE CountryCode = '"+ eachcodecou + "' Group By CountryCode";
                    BigInteger cccity = getpopulationcity(strSelect1);
                    popcity = popcity.add(cccity);
                }
                conpop1.total = total;
                conpop1.citypop = popcity;
                livingnoncontinent.add(conpop1);
            }
            return livingnoncontinent;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get living and non-living population continent detail");
            return null;
        }
    }


    //Living and non-living population of regions
    public ArrayList<population> getlivingnonregion() throws SQLException {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT COUNT(Name), Region FROM country GROUP BY Region ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Languages information
            ArrayList<population> livingnonregion= new ArrayList<population>();
            ArrayList<String> livingnonnamereg = new ArrayList<String>();
            while (rset.next()) {
                livingnonnamereg.add(rset.getString("Region"));
            }
            for(String eachregdetail:livingnonnamereg){
                population regpop1 =  new population();
                ArrayList<String> livingnonname = new ArrayList<String>();
                BigInteger total = new BigInteger("0");
                BigInteger popcity = new BigInteger("0");
                regpop1.name = eachregdetail;
                String totalpop = "SELECT Code, Population FROM country WHERE Region = '" + eachregdetail +"'";
                ResultSet rset1 = stmt.executeQuery(totalpop);
                while (rset1.next())
                {
                    livingnonname.add(rset1.getString("Code"));
                    int total1 = rset1.getInt("Population");
                    BigInteger total2 = BigInteger.valueOf(total1);
                    total = total.add(total2);
                }
                for(String eachcodecou: livingnonname){
                    String strSelect1 = "SELECT sum(Population) as popcity FROM city WHERE CountryCode = '"+ eachcodecou + "' Group By CountryCode";
                    BigInteger cccity = getpopulationcity(strSelect1);
                    popcity = popcity.add(cccity);
                }
                regpop1.total = total;
                regpop1.citypop = popcity;
                livingnonregion.add(regpop1);
            }
            return livingnonregion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get living and non-living population region detail");
            return null;
        }
    }

    public BigInteger getpopulationcity(String popci)
    {
        try {
            BigInteger ccity = new BigInteger("0");
            Statement stmt = con.createStatement();
            ResultSet popcire = stmt.executeQuery(popci);
            while (popcire.next())
            {
                int popci1 = popcire.getInt("popcity");
                BigInteger popci2 = BigInteger.valueOf(popci1);
                ccity = ccity.add(popci2);
            }
            return ccity;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("NONE");
            return null;
        }
    }



    //Living and non-living population of countries
    public ArrayList<population> getlivingnoncountry() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Name, country.Population, sum(city.Population) FROM country, city WHERE country.Code = city.CountryCode Group By country.Code";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Languages information
            ArrayList<population> livingnoncountry = new ArrayList<population>();
            while (rset.next()) {
                population lnc = new population();
                lnc.name = rset.getString("country.Name");
                lnc.citypop = BigInteger.valueOf(rset.getLong("sum(city.Population)"));
                lnc.total = BigInteger.valueOf(rset.getLong("country.population"));
                livingnoncountry.add(lnc);
            }
            return livingnoncountry;
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
        System.out.println(String.format("%-35s %25s", "Number of Country", "Language"));
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

    //Living and Non-Living Continent
    public void pringlivingnoncontinent(ArrayList<population> livingnoncontinent) {
        // Check language is not null
        if (livingnoncontinent == null) {
            System.out.println("No Living Non Continent Information");
            return;
        }
        // Loop over all countries in the list
        for (population pop : livingnoncontinent) {
            BigInteger total = pop.total;
            if (total.compareTo(BigInteger.ZERO) == 0)
            {
                System.out.println("Total population of " +pop.name+ "living in cities is " + pop.citypop+ "%" + " and non living in cities is " + total.subtract(pop.citypop));
            }
            else{
                BigDecimal perc = new BigDecimal("100");
                BigDecimal citypertage = new BigDecimal (pop.citypop).multiply(perc).divide( new BigDecimal (pop.total), 2);
                BigDecimal nonlivingper = perc.subtract(citypertage);
                System.out.println("Total population of " +pop.name+ "living in cities is " + citypertage+ "%" + " and non living in cities is " + nonlivingper +"%");
            }
        }
    }

    //Living and Non-Living Region
    public void pringlivingnonregion(ArrayList<population> livingnonregion) {
        // Check language is not null
        if (livingnonregion == null) {
            System.out.println("No Living Non Region Information");
            return;
        }
        // Loop over all countries in the list
        for (population pop : livingnonregion) {
            BigInteger total = pop.total;
            if (total.compareTo(BigInteger.ZERO) == 0)
            {
                System.out.println("Total population of " +pop.name+ "living in cities is " + pop.citypop+ "%" + " and non living in cities is " + total.subtract(pop.citypop));
            }
            else{
                BigDecimal perc = new BigDecimal("100");
                BigDecimal citypertage = new BigDecimal (pop.citypop).multiply(perc).divide( new BigDecimal (pop.total), 2);
                BigDecimal nonlivingper = perc.subtract(citypertage);
                System.out.println("Total population of " +pop.name+ "living in cities is " + citypertage+ "%" + " and non living in cities is " + nonlivingper +"%");
            }
        }
    }

    //Living and Non-Living Country
    public void pringlivingnoncountry(ArrayList<population> livingnoncountry) {
        // Check language is not null
        if (livingnoncountry == null) {
            System.out.println("No Living Non Country Information");
            return;
        }
        // Loop over all countries in the list
        for (population pop : livingnoncountry) {
            BigInteger total = pop.total;
            if (total.compareTo(BigInteger.ZERO) == 0)
            {
                System.out.println("Total population of " +pop.name+ "living in cities is " + pop.citypop+ "%" + " and non living in cities is " + total.subtract(pop.citypop));
            }
            else{
                BigDecimal perc = new BigDecimal("100");
                BigDecimal citypertage = new BigDecimal (pop.citypop).multiply(perc).divide( new BigDecimal (pop.total), 2);
                BigDecimal nonlivingper = perc.subtract(citypertage);
                System.out.println("Total population of " +pop.name+ "living in cities is " + citypertage+ "%" + " and non living in cities is " + nonlivingper + "%");
            }
        }
    }

}
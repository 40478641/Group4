package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class AppTest
{
    static App app;
    @BeforeAll
    static void init()
    {
        app = new App();
    }
    @Test
    void printcountrylist()
    {
        ArrayList<country> countrylist = new ArrayList<country>();
        countrylist.add(null);
        app.printcountrylist(countrylist);
    }
    @Test
    void printcitylist()
    {
        ArrayList<city> citylist = new ArrayList<city>();
        citylist.add(null);
        app.printcitylist(citylist);
    }
    @Test
    void printPopulationRegion()
    {
        ArrayList<country> regions = new ArrayList<country>();
//        regions.add(null);
        app.printPopulationRegion(null);
    }

    @Test
    void printWorldPopulation()
    {
        ArrayList<country> WorldPopulation = new ArrayList<country>();
//        CityPopulation.add(null);
        app.printWorldPopulation(null);
    }

    @Test
    void printPopulationContinent()
    {
        ArrayList<country> continents = new ArrayList<country>();
        //continents.add(null);
        app.printPopulationContinent(null);
    }
    @Test
    void printPopulationCountry()
    {
        ArrayList<country> country = new ArrayList<country>();
//        country.add(null);
        app.printPopulationCountry(null);
    }
    @Test
    void printDistrictPopulation()
    {
        ArrayList<city> District = new ArrayList<city>();
//        District.add(null);
        app.printDistrictPopulation(null);
    }

    @Test
    void printCityPopulation()
    {
        ArrayList<city> CityPopulation = new ArrayList<city>();
//        CityPopulation.add(null);
        app.printCityPopulation(null);
    }

    @Test
    void printlanguagelist()
    {
        ArrayList<countrylanguage> languagelist = new ArrayList<countrylanguage>();
        languagelist.add(null);
        app.printlanguagelist(languagelist);
    }

    @Test
    void pringlivingnoncontinent()
    {
        ArrayList<population> livingnoncontinent = new ArrayList<population>();
//        livingnoncontinent.add(null);
        app.pringlivingnoncontinent(null);
    }


    @Test
    void pringlivingnonregion()
    {
        ArrayList<population> livingnonregion = new ArrayList<population>();
//        livingnonregion.add(null);
        app.pringlivingnonregion(null);
    }

    @Test
    void pringlivingnoncountry()
    {
        ArrayList<population> livingnoncountry = new ArrayList<population>();
//        livingnoncountry.add(null);
        app.pringlivingnoncountry(null);
    }


}
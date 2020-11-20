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

}
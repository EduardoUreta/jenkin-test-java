package com.org.example;

import org.example.Suma;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SumaTest {

    private Suma suma;
    private int result;

    @BeforeMethod
    public void setUp(){
        result = 0;
    }

    @Test
    public void testSuma() {
        result = Suma.suma(5, 3);
        Assert.assertEquals(result, 8, "La suma debería ser 8");
    }

    @Test
    public void testSumaFail() {
        result = Suma.suma(5, 3);
        Assert.assertEquals(result, 2, "La suma debería ser 8");
    }
}

package com.example;

import org.example.Multiplicacion;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiplicacionTest {

    private Multiplicacion multiplicacion;
    private int result;

    @BeforeMethod
    public void setUp() {
        result = 0;
        System.out.println("Ejecutando Test:");
    }

    @Test
    public void TestMultiplicar() {
        result = Multiplicacion.multiplicar(5, 3);
        Assert.assertEquals(result, 15, "El resultado es 15");
    }

    /** @Test
    public void TestMultiplicarFail() {
        result = Multiplicacion.multiplicar(5, 3);
        Assert.assertEquals(result, 20, "El resultado es 20");
        System.out.println("xD");
    } */

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aylin
 */
public class PascalTriangleTest {
    
    public PascalTriangleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of build method, of class PascalTriangle.
     */
    @Test
    public void pruebaPositivo() {
        System.out.println("Prueba de numero Positivos");
        int levels = 1;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[1]\n" +
"";
        String result = instance.build(levels);
        assertEquals("Prueba Fallida",expResult, result);
    }
    
     @Test
    public void pruebaNegativo() {
        System.out.println("Prueba con numero negativo");
        int levels = -2;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("Prueba fallida",expResult, result);
    }
    
        @Test
    public void pruebaValorFloat() {
        System.out.println("Prueba con flotante");
        int levels = (int) 2.28;
        PascalTriangle instance = new PascalTriangle(); 
        String expResult = "[1]\n[1, 1]\n";
        String result = instance.build(levels);
        assertEquals("Prueba fallida",expResult, result);
    }
     @Test
    public void pruebaCero() {
        System.out.println("Prueba con el numero 0");
        int levels = 0;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("Prueba Fallida",expResult, result);
    }
    
     @Test
    public void pruebaMinimo() {
        System.out.println("Prueba con el numero 0");
        int levels = Integer.MIN_VALUE;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("Prueba Fallida",expResult, result);
    }

    
    @Test
    public void pruebaMaximo() {
        System.out.println("Prueba valor minimo");
        int levels = Integer.MAX_VALUE+1;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("Prueba fallida",expResult, result);
    }

}

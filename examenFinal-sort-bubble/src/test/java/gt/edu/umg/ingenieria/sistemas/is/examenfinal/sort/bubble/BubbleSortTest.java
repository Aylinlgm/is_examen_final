/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

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
public class BubbleSortTest {
    
    public BubbleSortTest() {
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


    @Test
    public void testEntradaBasica() {
         System.out.println("Prueba #1 - Entrada Basica");
        int[] input = new int[]{8, 2, 2, 4, 5};
        int[] expectedResult = new int[]{2, 2, 4, 5, 8};
        int[] actualResult = BubbleSort.sortBasic(input);
        assertArrayEquals("Prueba #1 fallida!!!", expectedResult, actualResult);
    }
    
     @Test
    public void testEntradaVacia() {
         System.out.println("Prueba #2 - Entrada Vacia");
        int[] input = new int[]{};
        int[] expectedResult = new int[]{};
        int[] actualResult = BubbleSort.sortBasic(input);
        assertArrayEquals("Prueba #2 fallida!!!", expectedResult, actualResult);
    }
    
       
     @Test
    public void testEntradaNula() {
         System.out.println("Prueba #3 - Entrada Nula");
        int[] input = null;
        int[] expectedResult = null;
        int[] actualResult = BubbleSort.sortBasic(input);
        assertArrayEquals("Prueba #3 fallida!!!", expectedResult, actualResult);
    }
    
         @Test
    public void testEntradaNegativa() {
         System.out.println("Prueba #4 - Entrada Negativos");
        int[] input = new int[]{-3,-1,-9};
        int[] expectedResult = new int[]{-9,-3,-1};
        int[] actualResult = BubbleSort.sortBasic(input);
        assertArrayEquals("Prueba #4 fallida!!!", expectedResult, actualResult);
    }
    
             @Test
    public void testEntradaDeLongitudVacia() {
         System.out.println("Prueba #5- Entrada Longitud Vacia");
        int[] input = new int[0];
        int[] expectedResult = new int[0];
        int[] actualResult = BubbleSort.sortBasic(input);
        assertArrayEquals("Prueba #5 fallida!!!", expectedResult, actualResult);
    }
}

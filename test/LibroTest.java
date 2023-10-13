/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vina
 */
public class LibroTest {
    
    public LibroTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Libro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Libro instance = new Libro();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPaginas method, of class Libro.
     */
    @Test
    public void testGetNumPaginas() {
        System.out.println("getNumPaginas");
        Libro instance = new Libro();
        int expResult = 0;
        int result = instance.getNumPaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumPaginas method, of class Libro.
     */
    @Test
    public void testSetNumPaginas() {
        System.out.println("setNumPaginas");
        int numPaginas = 0;
        Libro instance = new Libro();
        instance.setNumPaginas(numPaginas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Libro.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Libro instance = new Libro();
        int expResult = 0;
        int result = instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Libro.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        int precio = 0;
        Libro instance = new Libro();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Libro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

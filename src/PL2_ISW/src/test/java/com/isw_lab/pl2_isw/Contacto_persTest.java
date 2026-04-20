/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.isw_lab.pl2_isw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Emanuel Baciu
 */
public class Contacto_persTest {
    
    public Contacto_persTest() {
    }

    /**
     * Test of getNombre method, of class Contacto_pers.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Contacto_pers instance = new Contacto_pers("Juan","879665009","juan@yahoo.es", "28807");
        String expResult = "Juan";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTelf method, of class Contacto_pers.
     */
    @Test
    public void testGetTelf() {
        System.out.println("getTelf");
        Contacto_pers instance = new Contacto_pers("Juan","879665009","juan@yahoo.es", "28807");
        String expResult = "879665009";
        String result = instance.getTelf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMail method, of class Contacto_pers.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Contacto_pers instance = new Contacto_pers("Juan","879665009","juan@yahoo.es", "28807");
        String expResult = "juan@yahoo.es";
        String result = instance.getMail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCp method, of class Contacto_pers.
     */
    @Test
    public void testGetCp() {
        System.out.println("getCp");
        Contacto_pers instance = new Contacto_pers("Juan","879665009","juan@yahoo.es", "28807");
        String expResult = "28807";
        String result = instance.getCp();
        assertEquals(expResult, result);
    }
    
}

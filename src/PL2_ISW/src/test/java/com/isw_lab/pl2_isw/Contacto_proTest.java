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
public class Contacto_proTest {
    
    public Contacto_proTest() {
    }
    /**
     * Test of getEmpresa method, of class Contacto_pro.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        Contacto_pro instance = new Contacto_pro("Juan","879665009","juan@yahoo.es", "28807", "UAH", "Estudiante");
        String expResult = "UAH";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCargo method, of class Contacto_pro.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        Contacto_pro instance = new Contacto_pro("Juan","879665009","juan@yahoo.es", "28807", "UAH", "Estudiante");
        String expResult = "Estudiante";
        String result = instance.getCargo();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getNombre method, of class Contacto_pers.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Contacto_pro instance = new Contacto_pro("Juan","879665009","juan@yahoo.es", "28807", "UAH", "Estudiante");
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
        Contacto_pro instance = new Contacto_pro("Juan","879665009","juan@yahoo.es", "28807", "UAH", "Estudiante");
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
        Contacto_pro instance = new Contacto_pro("Juan","879665009","juan@yahoo.es", "28807", "UAH", "Estudiante");
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
        Contacto_pro instance = new Contacto_pro("Juan","879665009","juan@yahoo.es", "28807", "UAH", "Estudiante");
        String expResult = "28807";
        String result = instance.getCp();
        assertEquals(expResult, result);
    }
}

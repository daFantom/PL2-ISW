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
public class Tareas_pendTest {
    
    public Tareas_pendTest() {
    }

    /**
     * Test of getDesc method, of class Tareas_pend.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        Tareas_pend instance = new Tareas_pend("Descripcion", "Pendiente", true);
        String expResult = "Descripcion2";
        String result = instance.getDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class Tareas_pend.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Tareas_pend instance = new Tareas_pend("Descripcion", "Pendiente", true);
        String expResult = "Pendiente";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPrioridad method, of class Tareas_pend.
     */
    @Test
    public void testIsPrioridad() {
        System.out.println("isPrioridad");
        Tareas_pend instance = new Tareas_pend("Descripcion", "Pendiente", true);
        boolean expResult = true;
        boolean result = instance.isPrioridad();
        assertEquals(expResult, result);
    }
    
}

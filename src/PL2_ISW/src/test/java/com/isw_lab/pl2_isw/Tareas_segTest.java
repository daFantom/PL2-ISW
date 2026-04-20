/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.isw_lab.pl2_isw;

import java.util.ArrayList;
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
public class Tareas_segTest {
    
    public Tareas_segTest() {
    }
    
    /**
     * Test of getFecha_limite method, of class Tareas_seg.
     */
    @Test
    public void testGetFecha_limite() {
        System.out.println("getFecha_limite");
        Tareas_seg instance = new Tareas_seg("Descripcion", "Pendiente", "22/09/2027", true);
        String expResult = "22/09/2027";
        String result = instance.getFecha_limite();
        assertEquals(expResult, result);
    }
    /**
     * Test of getDesc method, of class Tareas_pend.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        Tareas_seg instance = new Tareas_seg("Descripcion", "Pendiente", "22/09/2027", true);
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
        Tareas_seg instance = new Tareas_seg("Descripcion", "Pendiente", "22/09/2027", true);
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
        Tareas_seg instance = new Tareas_seg("Descripcion", "Pendiente", "22/09/2027", true);
        boolean expResult = true;
        boolean result = instance.isPrioridad();
        assertEquals(expResult, result);
    }
}

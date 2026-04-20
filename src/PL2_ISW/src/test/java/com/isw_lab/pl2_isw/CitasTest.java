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
public class CitasTest {
    
    public CitasTest() {
    }
    
    /**
     * Test of getFecha method, of class Citas.
     */
    @Test
    public void testGetFecha() {
        System.out.println("Test unitario Citas->getFecha");
        Citas instance = new Citas(new String("12/20/2026"),"13:00","Principe de Asturias");
        String expResult = "12/20/2026";
        String result = instance.getFecha();
        assertEquals(expResult, result);

    }
    /**
     * Test of getHora method, of class Citas.
     */
    @Test
    public void testGetHora() {
        System.out.println("Test unitario Citas->getHora()");
        Citas instance = new Citas("12/20/2026","13:00","Principe de Asturias");
        String expResult = "13:00";
        String result = instance.getHora();
        assertEquals(expResult, result);
    }


    /**
     * Test of getLugar method, of class Citas.
     */
    @Test
    public void testGetLugar() {
        System.out.println("Test unitario Citas->getLugar");
        Citas instance = new Citas("12/20/2026","13:00","Principe de Asturias");
        String expResult = "Principe de Asturias";
        String result = instance.getLugar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPers_involucradas method, of class Citas.
     */
    @Test
    public void testGetPers_involucradas() {
        System.out.println("Test unitario Citas->getPers_involucradas PD: EN CASO DE ESTAR VACIAS");
        Citas instance = new Citas("12/20/2026","13:00","Principe de Asturias");
        ArrayList<Contacto_pers> expResult = new ArrayList<>();
        ArrayList<Contacto_pers> result = instance.getPers_involucradas();
        assertEquals(expResult, result);
    }
}

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
public class Citas_jobTest {
    
    public Citas_jobTest() {
    }
    
    /**
     * Test of getDuracion_est method, of class Citas_job.
     */
    @org.junit.jupiter.api.Test
    public void testGetDuracion_est() {
        System.out.println("getDuracion_est");
        Citas_job instance = new Citas_job("12/20/2026","13:00","Principe de Asturias", "00:15:00");
        String expResult = "00:15:00";
        String result = instance.getDuracion_est();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAgenda_temas method, of class Citas_job.
     */
    @org.junit.jupiter.api.Test
    public void testGetAgenda_temas() {
        System.out.println("getAgenda_temas [VACIAS]");
        Citas_job instance = new Citas_job("12/20/2026","13:00","Principe de Asturias", "00:15:00");
        ArrayList<String> expResult = new ArrayList();
        ArrayList<String> result = instance.getAgenda_temas();
        assertEquals(expResult, result);
    }
    
}

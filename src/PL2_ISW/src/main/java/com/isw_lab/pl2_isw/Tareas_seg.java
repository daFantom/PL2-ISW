package com.isw_lab.pl2_isw;

import java.util.ArrayList;

/**
 *
 * @author Emanuel Baciu
 * @author Ruben Rivas Rodriguez
 * @author Pablo Cortes Tudela
 */
public class Tareas_seg extends Tareas_pend
{
    
    private String desc, status, fecha_limite;
    private boolean prioridad;
    private ArrayList<Contacto_pro> responsables;
    
    public Tareas_seg(String pdesc, String pstatus, String f_limite,
            boolean prio, ArrayList<Contacto_pro> presponsables)
    {
        super(pdesc, pstatus, prio);
        fecha_limite = f_limite;
        presponsables = new ArrayList<Contacto_pro>();
    }

    public String getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(String fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public ArrayList<Contacto_pro> getResponsables() {
        return responsables;
    }

    public void addResponsables(Contacto_pro responsable) {
        if(!responsables.contains(responsable)) responsables.add(responsable);
        else System.out.println("Ya existe este responsable");
    }
    
    
}

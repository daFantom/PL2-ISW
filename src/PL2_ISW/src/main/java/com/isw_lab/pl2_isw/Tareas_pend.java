package com.isw_lab.pl2_isw;

/**
 *
 * @author Emanuel Baciu
 * @author Ruben Rivas Rodriguez
 * @author Pablo Cortes Tudela
 */

public class Tareas_pend {
    private String desc, status;
    private boolean prioridad;
    
    public Tareas_pend(String pdesc, String pstatus, boolean prio)
    {
        desc = pdesc;
        status = pstatus;
        prioridad = prio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }
    
    
}

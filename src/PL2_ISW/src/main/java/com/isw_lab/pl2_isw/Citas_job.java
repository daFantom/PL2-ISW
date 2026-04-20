package com.isw_lab.pl2_isw;

import java.util.ArrayList;

/**
 *
 * @author Emanuel Baciu
 * @author Ruben Rivas Rodriguez
 * @author Pablo Cortes Tudela
 */
public class Citas_job extends Citas
{
    private String fecha, hora, lugar, duracion_est;
    private ArrayList<Contacto_pers> pers_involucradas;
    private ArrayList<String> agenda_temas;
    
    public Citas_job(String pfecha, String phora, String plugar,
            String pduracion)
    {
        super(pfecha, phora, plugar);
        agenda_temas = new ArrayList<String>();
    }

    public String getDuracion_est() {
        return duracion_est;
    }

    public void setDuracion_est(String duracion_est) {
        this.duracion_est = duracion_est;
    }

    public ArrayList<String> getAgenda_temas() {
        return agenda_temas;
    }

    public void setAgenda_temas(ArrayList<String> agenda_temas) {
        this.agenda_temas = agenda_temas;
    }
    
    
}

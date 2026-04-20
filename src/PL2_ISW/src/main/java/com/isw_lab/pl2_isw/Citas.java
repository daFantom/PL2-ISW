package com.isw_lab.pl2_isw;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Baciu
 * @author Ruben Rivas Rodriguez
 * @author Pablo Cortes Tudela
 */

public class Citas {
    private String fecha, hora, lugar;
    private ArrayList<Contacto_pers> pers_involucradas;
    
    public Citas(String pfecha, String phora, String plugar)
    {
        fecha = pfecha;
        hora = phora;
        lugar = plugar;
        pers_involucradas = new ArrayList<Contacto_pers>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Contacto_pers> getPers_involucradas() {
        return pers_involucradas;
    }

    public void setPers_involucradas(ArrayList<Contacto_pers> pers_involucradas) {
        this.pers_involucradas = pers_involucradas;
    }
    
    
}

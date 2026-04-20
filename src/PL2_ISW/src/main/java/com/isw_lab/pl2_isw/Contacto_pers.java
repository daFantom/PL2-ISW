package com.isw_lab.pl2_isw;

/**
 *
 * @author Emanuel Baciu
 * @author Ruben Rivas Rodriguez
 * @author Pablo Cortes Tudela
 */

public class Contacto_pers {
    private String nombre,telf, mail, cp;
    
    public Contacto_pers(String pnombre, String ptelf, String pmail, String pcp)
    {
        nombre = pnombre;
        telf = ptelf;
        mail = pmail;
        cp = pcp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    
    
}

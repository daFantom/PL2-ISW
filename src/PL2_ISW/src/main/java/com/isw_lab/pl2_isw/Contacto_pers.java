package com.isw_lab.pl2_isw;

/**
 *
 * @author Emanuel Baciu
 * @author Ruben Rivas Rodriguez
 * @author Pablo Cortes Tudela
 */

public class Contacto_pers {
    private String nombre,telf, mail, cp;
    private String[] domains = {"@gmail.com","@hotmail.com","@yahoo.com"};
    
    public Contacto_pers(String pnombre, String ptelf, String pmail, String pcp)
    {
        nombre = pnombre;
        
        if(telf.length()==9) telf = ptelf;
        else throw new IllegalArgumentException("Numero de telefono invalido.");
        
        if( !(mail.contains(domains[0]) || mail.contains(domains[1]) || mail.contains(domains[2])) ) mail = pmail;
        else throw new IllegalArgumentException("Correo electronico invalido.");
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
        if(telf.length()==9) this.telf = telf;
        else System.out.println("Numero de telefono invalido.");
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail)
    {
        if( mail.contains(domains[0]) || mail.contains(domains[1]) || mail.contains(domains[2]) ) this.mail = mail;
        else System.out.println("Correo electronico invalido.");
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    
    
}

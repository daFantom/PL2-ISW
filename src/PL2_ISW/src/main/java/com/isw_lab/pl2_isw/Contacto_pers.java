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
        
        if(ptelf.length()==9) telf = ptelf;
        else telf = "Invalido";
        
        if((pmail.contains(domains[0]) || pmail.contains(domains[1]) || pmail.contains(domains[2])) ) mail = pmail;
        else mail = "Invalido";
        cp = pcp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelf() {
        return telf;
    }

    public String getMail() {
        return mail;
    }

    public String getCp() {
        return cp;
    }

    
    
}

package com.isw_lab.pl2_isw;

/**
 *
 * @author Emanuel Baciu
 * @author Ruben Rivas Rodriguez
 * @author Pablo Cortes Tudela
 */
public class Contacto_pro extends Contacto_pers
{
    private String nombre,telf, mail, cp, empresa, cargo;
    
    public Contacto_pro(String pnombre, String ptelf, String pmail,
            String pcp,String pempresa, String pcargo)
    {
        super(pnombre, ptelf, pmail, pcp);
        empresa = pempresa;
        cargo = pcargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getCargo() {
        return cargo;
    }

    
    
    
}

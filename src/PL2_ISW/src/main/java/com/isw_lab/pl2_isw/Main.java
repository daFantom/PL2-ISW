package com.isw_lab.pl2_isw;

/**
 *
 * @author Emanuel Baciu
 * @author Ruben Rivas Rodriguez
 * @author Pablo Cortes Tudela
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Contacto_pro cpro = new Contacto_pro("a", "b", "c", "d", "e", "f");
        System.out.println(cpro.getNombre());
        System.out.println(cpro.getMail());
        System.out.println(cpro.getEmpresa());
        System.out.println(cpro.getCp());
        System.out.println(cpro.getCargo());
        System.out.println(cpro.getTelf());
    }
}

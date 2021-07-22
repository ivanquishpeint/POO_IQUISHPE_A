/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Usuario
 */
public class Parlante {
    public static void SalidaP(){
        System.out.println("Reproduce");
    }
    public static String RetornoP(){
        String p="Transmite";
        return p;
    }
    public void salida(){
        System.out.println("Enciende");
    }
    public String retorno(){
       return "Apaga"; 
    }
}

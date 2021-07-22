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
public class Television {
    public static void SalidaT(){
        System.out.println("Transmite");
    }
    public static String RetornoT(){
        String t="Reproduce";
        return t;
    }
    public void salida(){
        System.out.println("Sintoniza");
    }
    public String retorno(){
       return "Recepta"; 
    }
    
}

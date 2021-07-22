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
public class Armario {
    public static void SalidaA(){
        System.out.println("Guarda");
    }
    public static String RetornoA(){
        String a="Organiza";
        return a;
    }
    public void salida(){
        System.out.println("Abre");
    }
    public String retorno(){
       return "Cierra"; 
    }
    
}

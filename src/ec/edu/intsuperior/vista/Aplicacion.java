/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Armario;
import ec.edu.intsuperior.modelo.Celular;
import ec.edu.intsuperior.modelo.Laptop;
import ec.edu.intsuperior.modelo.Parlante;
import ec.edu.intsuperior.modelo.Television;

/**
 *
 * @author Usuario
 */
public class Aplicacion {

    public static void main(String[] args) {
        
        System.out.println("ARMARIO");
        Armario.SalidaA();
        System.out.println(Armario.RetornoA());
        Armario obj=new Armario();
        obj.salida();
        System.out.println(obj.retorno());
        
        System.out.println("CELULAR"); 
        Celular.SalidaC();
        System.out.println(Celular.RetornoC());
        Celular ap=new Celular();
        ap.salida();
        System.out.println(ap.retorno());
        
        System.out.println("LAPTOP");
        Laptop.SalidaL();
        System.out.println(Laptop.RetornoL());
        Laptop lp=new Laptop();
        lp.salida();
        System.out.println(lp.retorno());
        
        System.out.println("PARLANTE");
        Parlante.SalidaP();
        System.out.println(Parlante.RetornoP());
        Parlante par=new Parlante();
        par.salida();
        System.out.println(par.retorno());
        
        System.out.println("TELEVISION");
        Television.SalidaT();
        System.out.println(Television.RetornoT());
        Television tv=new Television();
        tv.salida();
        System.out.println(tv.retorno());
       
        

    }

}

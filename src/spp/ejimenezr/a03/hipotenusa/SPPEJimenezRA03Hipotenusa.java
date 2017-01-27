/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.a03.hipotenusa;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezRA03Hipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Busquda de Hipotenusa");
        //Variables
        int opEntrada;
        double a, b, h ;
        Scanner kb = new Scanner (System.in); 
        //Realizamos operaciones
        System.out.println("Introduzca cateto 1");
        a= kb.nextDouble();
        System.out.println("Introduzca cateto 2");
        b= kb.nextDouble(); 
        //Resolver el problema
        h= Math.pow(a, 2)+ Math.pow(b, 2);
        System.out.println("Hipotenusa es" + Math.sqrt(h));
    }
    
}

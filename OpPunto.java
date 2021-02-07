/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi_practica1;

/**
 *
 * @author Gerardo
 */
public class OpPunto {
    public static int identidad(int pixel){
       return pixel;
    }
    
    public static int negativo(int pixel){
        //256 = q, es el rango de nuestro espacio
        int alfa = 256 - 1;
        return alfa - pixel;
    }
}

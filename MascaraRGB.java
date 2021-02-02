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
public class MascaraRGB {
    public static int getRed(int rgb){
        return (rgb>>16)&0x0ff;
    }
    
    public static int getGreen(int rgb){
        return (rgb>>8) &0x0ff;
    }
    
    public static int getBlue(int rgb){
        return (rgb)    &0x0ff;
    }
    
    public static int maskRGB(int red, int green, int blue){
        int rgb = 0;
        int r,g,b;
        r = (red<<16);
        g = (green<<8);
        b = blue;
        rgb = r | g | b;
        return rgb;
    }
}

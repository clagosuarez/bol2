/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_2;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);
        System.out.println("Introduce la temperatura en grados centígrados:");
        float celsius = temperatura.nextFloat();   
        System.out.println(celsius+" grados centígrados son "+((celsius*9/5)+32)+" grados Fahrenheit y "+(celsius+273.15)+" grados Kelvin");
    }
    
}

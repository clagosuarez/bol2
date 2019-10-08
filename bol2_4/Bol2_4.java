/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_4;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Introduce la cantidad en euros:");
        int euros = money.nextInt();
        System.out.println((euros/100)+" billetes de 100€ "+(euros%100/20)+" billetes de 20€ "+(euros%20/5)+" billetes de 5€ "+(euros%5)+" monedas de 1€");

    }
    
}

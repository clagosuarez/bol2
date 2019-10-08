/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_3;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Introduce la cantidad de billetes de 100€:");
        int billete100 = money.nextInt();
        System.out.println("Introduce la cantidad de billetes de 20€:");
        int billete20 = money.nextInt();
        System.out.println("Introduce la cantidad de billetes de 5€:");
        int billete5 = money.nextInt();
        System.out.println("Introduce la cantidad de monedas de 1€:");
        int moneda1 = money.nextInt();
        System.out.println("El total es: "+((billete100*100)+(billete20*20)+(billete5*5)+moneda1)+"€");
    }
    
}

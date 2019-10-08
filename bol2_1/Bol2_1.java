/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_1;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pre = new Scanner(System.in);
        System.out.println("Introduce el precio del producto en euros:");
        float precio = pre.nextFloat();
        System.out.println("Introduce el valor descontado en euros:");
        float tarifa = pre.nextFloat();
        Float porcentaxe = (float) (Math.round(100 * tarifa / precio));
        System.out.println("El porcentaje descontado es de:"+porcentaxe+"%");
    }
    
}

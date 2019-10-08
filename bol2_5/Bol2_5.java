/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_5;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner trabajador = new Scanner(System.in);
        System.out.println("Introduce el sueldo fijo:");
        double sueldo = trabajador.nextDouble();
        System.out.println("Introduce la facturación:");
        double facturacion = 0.05*(trabajador.nextDouble());
        System.out.println("Introduce los kms:");
        int kms = 2*(trabajador.nextInt());
        System.out.println("Introduce los días de desplazamiento:");
        int dias = 30*(trabajador.nextInt());
        
        System.out.println("Sueldo bruto: "+(sueldo+facturacion+kms+dias)+"€");
        System.out.println("Sueldo total: "+((sueldo+facturacion+kms+dias)-(sueldo+facturacion+kms+dias)*0.18-36)+"€");
    }
    
}

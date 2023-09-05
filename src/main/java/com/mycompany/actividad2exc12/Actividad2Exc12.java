/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc12;

/**
 *
 * @author omarz
 */

/*Enunciado
    23. Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación.
*/

import java.util.Scanner;

public class Actividad2Exc12 {
    public static void main(String[] args) {
        
        double pA, pB, pC, discriminante, x1, x2, x;
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el parametro A: ");
        pA = scanner.nextDouble();

        System.out.print("Ingrese el parametro B: ");
        pB = scanner.nextDouble();

        System.out.print("Ingrese el parametro C: ");
        pC = scanner.nextDouble();

        discriminante = pB * pB - 4 * pA * pC;


        if (discriminante > 0) {
            x1 = (-pB + Math.sqrt(discriminante)) / (2 * pA);
            x2 = (-pB - Math.sqrt(discriminante)) / (2 * pA);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            x = -pB / (2 * pA);
            System.out.println("La solución es: x = " + x);
        } else {
            System.out.println("No hay soluciones reales.");
        }

        scanner.close();
    }
}

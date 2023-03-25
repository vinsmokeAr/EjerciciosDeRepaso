/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que comprueba si un número   *
* 			   es múltiplo de dos o de tres. 		 *
*****************************************************/
package dev;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
       
        int num;

        System.out.print("Introduzca un número entero: ");
         Scanner sc = new Scanner(System.in);
         num = sc.nextInt();

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Es múltiplo de 2 o de 3");
        } else {
            System.out.println("No es múltiplo de 2 o de 3");                                                     
        }
    }
	
}

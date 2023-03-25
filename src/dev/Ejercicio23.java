/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que comprueba si un número   *
* 			   es múltiplo de tres y de cinco. 		 *
*****************************************************/



package dev;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
       
        int num;

        System.out.print("Introduzca un número entero: ");
         Scanner sc = new Scanner(System.in);
         num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Es múltiplo de 3 y de 5");
        } else {
            System.out.println("No es múltiplo de 3 y de 5");                                                     
        }
    }
	
	
	
}

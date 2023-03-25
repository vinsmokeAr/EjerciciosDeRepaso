/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa Java que lea un número 		 *
* 			   entero y calcule si es positivo o 	 *
* 			   negativo.	                         *
*****************************************************/
package dev;
import java.util.Scanner;



public class Ejercicio18 {
	public static void main(String[] args) {
        
       
        int num;

        System.out.print("Introduzca un número entero: ");
         Scanner sc = new Scanner(System.in);
         num = sc.nextInt();

        if (num > 0) {
            System.out.println("El número ingresado es positivo");
        } else if(num < 0){
            System.out.println("El número ingresado es negativo");
        } else {
            System.out.println("El número introducido es 0");                                                     
        }
    }
	
	
	
	
	
}

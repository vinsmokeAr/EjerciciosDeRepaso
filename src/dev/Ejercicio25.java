/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que comprueba si es una letra*
* 				mayúscula o minuscula		 		 *
*****************************************************/
package dev;

import java.io.IOException;

public class Ejercicio25 {
	
	 public static void main(String[] args) throws IOException {
	        char car;
	        System.out.print("Introduzca un carácter: ");
	        car = (char) System.in.read(); 


	        if (Character.isUpperCase(car))        
	        {
	            System.out.println("Es una letra mayúscula");
	        } else {
	            System.out.println("No es una letra mayúscula");
	        }
	    }
}

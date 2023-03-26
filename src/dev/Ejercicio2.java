/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa en el cual el usuario		 *
* 			   ingresa su nombre y el programa       *
*  			   imprime un mensaje de buenos días 	 *
* 			   con dicho nombre.	                 *
*****************************************************/

package dev;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String[] args) {
		
			 
			 

			  System.out.println("ingresa tu nombre");
			  Scanner sc = new Scanner (System.in);
			  String nombre = sc.nextLine();

			  System.out.println("buenos dias "+ nombre);
		
	}
	
}

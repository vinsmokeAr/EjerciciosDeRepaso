/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que comprueba si el año es   *
* 			   bisiesto.							 *											 		 *
*****************************************************/
package dev;
import java.util.Scanner;
public class Ejercicio29 {

	
	public static void main(String[] args) {
	int fecha;
	System.out.println("Ingrese el año a 4 dígitos: ");
	Scanner sc = new Scanner(System.in);
	fecha = sc.nextInt();
	
	if ( (fecha % 4 == 0 && fecha % 100!= 0)|| (fecha % 100 == 0 && fecha % 400 ==0 ) ) {
		
		System.out.println("El año "+fecha + " es bisiesto");
	}else {
		System.out.println("El año "+fecha + " no es bisiesto");
		
	}
	
	}

}

/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que lee la longitud de los   * 
* 			   catetos de un triángulo rectángulo y  * 
* 			   calcule la longitud de la hipotenusa  *
* 			   según el teorema de Pitágoras.        *
*****************************************************/
package dev;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		double c1,c2,hipo,result;
		
		System.out.println("Ingresa el valor del cateto 1");
		Scanner sc = new Scanner (System.in);
		c1 = sc.nextDouble();
		
		System.out.println("Ingresa el valor del cateto 2 ");
		Scanner sc1 = new Scanner (System.in);
		c2 = sc1.nextDouble();
		
		result = (c1*c1) + (c2*c2);
		hipo = Math.sqrt(result);
		
		System.out.println("El resultado de la hipotenusa es de: "+ hipo);
		
	}
	
	
}

/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que muestra el área de un    *
* 				triangulo               			 *
*****************************************************/

package dev;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		double form, a, b, c;
		System.out.println("Ingrese el valor del primer lado; ");
		Scanner sc = new Scanner (System.in);
		a = sc.nextDouble();
		System.out.println("Ingrese el valor del segundo lado; ");
		b = sc.nextDouble();
		System.out.println("Ingrese el valor del tercer lado; ");
		c = sc.nextDouble();
		
		form = (a+b+c)/2.0;

		System.out.println("El area del triangulo es " + (Math.sqrt( form*(form-a)*(form-b)*(form-c))));
	}
	
	
	
	
}

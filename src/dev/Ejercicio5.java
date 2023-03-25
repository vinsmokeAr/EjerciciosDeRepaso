/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que calcula la longitud y    *
* 			   el área de una circunferencia	     *
*****************************************************/

package dev;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main (String[] args) {
		
		double radio,longitud, area;
		
		System.out.println("Ingrese el radio de la circunferencia; ");
		Scanner sc = new Scanner (System.in);
		radio = sc.nextDouble();
		
		longitud = 2 * 3.1416 * radio;
		area = 3.1416 * Math.pow(radio, 2);
		
		System.out.println("La longitud es; "+ longitud + "\nEl área es: " + area);
		
		
	}
	
	
}

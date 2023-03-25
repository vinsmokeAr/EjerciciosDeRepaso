/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que calcula el precio final	 *
* 			   de un producto						 *			                     
*****************************************************/
package dev;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		
		
		double prod, preciof, preciof2, preciof3, preciof4;
		System.out.println("Ingresa el costo de compra del producto; ");
		Scanner sc = new Scanner (System.in);
		prod = sc.nextDouble();
		
		preciof = prod * .20;
		preciof2 = prod+preciof;
		preciof3 = preciof2*.16;
		preciof4 = preciof3+preciof2;
		System.out.println("EL precio final del producto es de; "+preciof4);
		
		
	}
	
}

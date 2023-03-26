/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 25/03/2023						 *
* Fecha de actualización: 25/03/2023 				 *
* Descripción: Programa que pase de millas a km.     *													 				 		
*****************************************************/


package dev;
import java.util.Scanner;
public class Ejercicio49 {

	public static void main(String[] args) {
		
		
		double millas, km;
		System.out.println("Ingresa las millas; ");
		Scanner sc= new Scanner (System.in);
		millas = sc.nextDouble();
	
		km = millas * 1.60934;
		
		System.out.println("las millas a kilometros son; "+km);
	
	}
	
	
	}
	
	
	


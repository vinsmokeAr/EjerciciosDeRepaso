/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que te dice tu número de la  *
* 				suerte.			                     *
*****************************************************/


package dev;

import java.util.Scanner;

public class Ejercicio13 {

public static void main(String[] args) {
		
		int dia, mes, año;
		
		System.out.println("Ingresa tu dia de nacimiento con número; ");
		Scanner sc = new Scanner (System.in);
		dia = sc.nextInt();
		
		System.out.println("Ingresa tu mes de nacimiento con números; ");
		mes = sc.nextInt();
		
		System.out.println("Ingresa tu año de nacimiento con números; ");
		año = sc.nextInt();
		
		
		System.out.println("Tu número de la suete es; "+ (dia-mes) );
		
		
		
		
		
	}
	

}

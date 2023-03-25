/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que convierte los km/s a m/s *
*****************************************************/

package dev;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		double km, metro;
		
		System.out.println("Ingresa los km/h que quieras convertir a m/s");
		Scanner sc = new Scanner (System.in);
		km=sc.nextDouble();
		
		metro = km/3.6;
		
		System.out.println("Velocidad en km/s; " + km + "\nVelocidad en metros/s; " + metro);
	}
	
	
}

/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que visualiza las 5 cifras   *
* 			  un número desde el final.              *
*****************************************************/
package dev;
import java.util.Scanner;



public class Ejercicio12 {
	public static void main(String[] args) {
        
        int num;
        System.out.print("Introduzca valor del número: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();                           
        System.out.println(num/10000);
        System.out.println(num/1000);
        System.out.println(num/100);
        System.out.println(num/10);
        System.out.println(num);
    }
}

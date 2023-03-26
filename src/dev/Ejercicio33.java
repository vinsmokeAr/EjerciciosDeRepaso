/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que calcular el mayor de  	 *
* 			   tres números enteros en Java.		 *						 *					 		 *
*****************************************************/
package dev;
import java.util.Scanner;

public class Ejercicio33 {
	public static void main(String[] args) {

	int num1,num2,num3;	
		
	System.out.println("Ingresa el primer número; ");
	Scanner sc = new Scanner(System.in);
	 num1=sc.nextInt();
	System.out.println("Ingresa el segundo número; ");
	 num2=sc.nextInt();
	System.out.println("Ingresa el tercer número; ");
	 num3=sc.nextInt();
	 
	 if (num1 > num2) {
         if (num1 > num3) {
             System.out.println("El mayor es: " + num1);                                             
         } else {
             System.out.println("el mayor es: " + num3);     
         }
     } else if (num2 > num3) {
         System.out.println("el mayor es: " + num2);
     } else {
         System.out.println("el mayor es: " + num3);
     }
		 
		 }
		 
}
	
	
	
	


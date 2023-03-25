/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que lee un num. de 3 cifras  *
* 			  y muestra sus cifras por separado.	 *
*****************************************************/
package dev;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main() {

	 
	  int n;
	  
	  System.out.println("ingrese un número ");
	  Scanner sc=new Scanner(System.in);
	  
	  n=sc.nextInt();
	  
	  System.out.println("Primera cifra  "+(n/100));
	  System.out.println("Segunda cifra  "+(n/10%10));
	  System.out.println("Tercera cifra  "+(n%10));
	}
	  
}

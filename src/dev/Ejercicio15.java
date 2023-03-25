
/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa quite a una variable N sus 	 *
* 			  m últimas cifras.		                 *
*****************************************************/



package dev;
import java.util.Scanner;

public class Ejercicio15 {  
	 public static void main(String[] args) {                                                                      
	        
	        int N, m;
	        
	        System.out.print("Introduzca el número: ");
	        Scanner sc = new Scanner(System.in);
	       	N = sc.nextInt();
	        System.out.print("Introduzca valor de m: ");
	        m = sc.nextInt();
	        
	        N = N / (int)Math.pow(10,m);
	        
	        System.out.println("El número modificado es; " + N);
	    }
}

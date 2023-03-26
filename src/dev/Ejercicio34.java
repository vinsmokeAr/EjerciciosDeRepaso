/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que calcula el mayor de  	 *
* 			   tres números enteros en Java.		 *						 *					 		 *
*****************************************************/
package dev;
import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {                                                                      
        int H,M,S;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        H =  sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M =  sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S =  sc.nextInt();
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)                                                          
           System.out.println("la hora ingresada es correcta");
        else
            System.out.println("la hora ingresada es incorrecta");
    }
	
}

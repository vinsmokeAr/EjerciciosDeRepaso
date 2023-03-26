/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que comprueba si un número   *
* 				de tres cifras es capicúa			 *											 		 *
*****************************************************/
package dev;
import java.util.Scanner;
public class Ejercicio30 {
	public static void main(String[] args) {
        
        int num;

        System.out.print("Introduzca número de 3 cifras: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num >= 100 && num <= 999) {  
            if (num % 10 == num / 100) {                                    
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        } else {
            System.out.println("El número ingresado es un número de 3 cifras");
        }
    }
}

/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 25/03/2023						 *
* Fecha de actualización: 25/03/2023 				 *
* Descripción: Programa que lea números e indique si *
* 			   son positivos o negativos y pares o 	 *
* 			   impares     							 *													 				 		
*****************************************************/

package dev;
import java.util.Scanner;
public class Ejercicio48 {

	public static void main(String[] args) {
       
        int num;
         Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un número (0 para salir): ");
            num = sc.nextInt();
            
            if (num != 0) {
                if (num > 0) {
                    System.out.print("El número es positivo, ");
                } else {
                    System.out.print("El número es negativo, ");
                }
                
                if (num % 2 == 0) {
                    System.out.println("y es par.");
                } else {
                    System.out.println("y es impar.");
                }
            }
        } while (num != 0);
        
        sc.close();
    }
	
	
	
	
}

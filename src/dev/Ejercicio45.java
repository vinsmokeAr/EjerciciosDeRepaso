/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 25/03/2023						 *
* Fecha de actualización: 25/03/2023 				 *
* Descripción:  Programa Java que lea dos números y  *
* 				muestre los números desde el menor   *
* 				hasta el mayor.  					 *													 				 		
*****************************************************/

package dev;
import java.util.Scanner;
public class Ejercicio45 {
	public static void main(String[] args) {
        
        System.out.print("Introduce el primer número: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);
        
        System.out.println("Números desde el menor hasta el mayor:");
        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " ");
        }
    }
}

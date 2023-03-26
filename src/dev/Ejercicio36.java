/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa para pasar una calificación  *
* 			   numérica a alfabética.				 *													 					 		
*****************************************************/

package dev;
import java.util.Scanner;
public class Ejercicio36 {

	
	
	public static void main(String[] args) {
        
        int num;

        System.out.print("Introduzca un número que sea entre 0 y 10: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num	< 0 || num > 10) {
            System.out.println("Nota incorrecta");
        } else if (num < 5) {
            System.out.println("Insuficiente");
        } else if (num < 6) {
            System.out.println("Suficiente");
        } else if (num < 7) {
            System.out.println("Bien");
        } else if (num < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");                                                                  
        }
    }
}

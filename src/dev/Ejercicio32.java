/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción:  Programa que lea dos números por 	 *
* 				teclado y muestre el resultado de la *
* 				división del mayor entre el menor.   * 
* 				Se debe comprobar que el divisor no  *
* 				puede ser cero.						 *
							    					 *											 		 *
*****************************************************/
package dev;
import java.util.Scanner;
public class Ejercicio32 {

	public static void main(String[] args) {

      
        double num1, num2, Nmayor, Nmenor;

        System.out.print("Introduzca primer número: ");
         Scanner sc = new Scanner(System.in);
         num1 = sc.nextDouble();
        System.out.print("Introduzca segundo número: ");
        num2 = sc.nextDouble();

        if(num1 != num2){
           if (num1 > num2) {
               Nmayor = num1;
               Nmenor = num2;
           } else {
               Nmayor = num2;
               Nmenor = num1;
           }

           if (Nmenor == 0) {
               System.out.println("No se puede dividir por cero");
           } else {
               System.out.println(Nmayor + " / " + Nmenor + " = " + Nmayor / Nmenor);                                 
           } 
        }else{
            System.out.println("Los números son iguales");
        }
    }
	
	
	
}

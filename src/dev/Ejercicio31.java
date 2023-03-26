/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que lea dos números por		 *
*              teclado y muestre el resultado de la  *
*              división del primero por el segundo.  *
*              Se debe comprobar que el divisor no 	 *	
*              puede ser cero.						 *
							 						 *											 		 *
*****************************************************/


package dev;
import java.util.Scanner;

public class Ejercicio31{
public static void main(String[] args) {


	int Prim,Seg,R;
	System.out.println("Introduce el primer numero: ");
	Scanner teclado=new Scanner (System.in);
	
	Prim=teclado.nextInt();
	System.out.println("Introduce el segundo numero: ");
	Seg=teclado.nextInt();
	if (Prim==0){
    System.out.println("El divisor no puede ser cero");
    }
        else{
            R=Seg/Prim;
            System.out.println("El resultado de la division es: " + R);
            }
  }
}
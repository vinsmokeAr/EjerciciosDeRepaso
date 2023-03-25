/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 23/03/2023						 *
* Fecha de actualización: 23/03/2023 				 *
* Descripción: Programa que comprueba si dos letras  *
* 				son iguales					 		 *
*****************************************************/

package dev;
import java.io.*;
public class Ejercicio26 {
	
	 public static void main(String[] args) throws IOException {

	        char car1, car2;
	        System.out.print("Introduzca la primer letra: ");
	        car1 = (char)System.in.read(); 
	        System.in.read();                                 
	        System.out.print("Introduzca segundo carácter: ");
	        car2 = (char)System.in.read();

	        if(car1 == car2){
	           System.out.println("Son iguales");   
	        }else{
	           System.out.println("No son iguales");
	        }        
	    }
}

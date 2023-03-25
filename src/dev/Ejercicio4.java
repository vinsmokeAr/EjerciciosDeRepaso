/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que calcula los grados		 *
* 			   centigrados a Fahrenheit.             *
*****************************************************/
package dev;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ejercicio4 extends JFrame implements ActionListener{
	
		static double centi, fare;
	public Ejercicio4() {
		JLabel lbTitulo,lbResultado;
		JTextField txtInfo;
		JButton btnAcep;

		lbTitulo = new JLabel("Grados celcius a Fahrenheit:");
		lbResultado = new JLabel("");
		txtInfo = new JTextField();
		btnAcep = new JButton("Aceptar");
		
		lbTitulo.setBounds(75, 50, 150, 20);
		txtInfo.setBounds(75, 80, 150, 20);
		btnAcep.setBounds(75, 100, 100, 20);
		lbResultado.setBounds(0, 150, 300, 60);
		
		add(lbTitulo);
		add(txtInfo);
		add(btnAcep);
		add(lbResultado);
		
		btnAcep.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centi = Double.parseDouble(txtInfo.getText());
				fare = 32+ (9 * centi /5);
				
				lbResultado.setText(centi + "°C equivale a " + fare + " °F ");
			}
		});		
		
		setSize(300, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Convertidor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	
	
	public static void main(String[] args){
		Ejercicio4 window = new Ejercicio4();
		
		window.setVisible(true);
		
//	Scanner sc = new Scanner (System.in);
//	
//	System.out.println("Ingresa los grados centigrados para convertirlos a Fahrenheit; ");
//	centi = sc.nextDouble();
//	
//	
//	System.out.println(+ centi + " °C "+ fare + " °F " );
//	
	
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}

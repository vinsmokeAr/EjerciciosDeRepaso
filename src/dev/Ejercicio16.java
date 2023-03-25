/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción:Programa que pasa de grados centigrados*
* 				a grados kelvin y grados reamur.	 *	                 
*****************************************************/
package dev;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Ejercicio16 extends JFrame implements ActionListener {
	static double cel,kel,rea;
	
	public Ejercicio16() {
		JLabel lbTitulo,lbResultado;
		JTextField txtInfo;
		JButton btnAcep;

		lbTitulo = new JLabel("Grados celcius:");
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
				cel = Double.parseDouble(txtInfo.getText());
				kel = cel + 273.15;
				rea = cel * 0.8;
				
				
				lbResultado.setText(cel + "°C equivale a " + kel + " °K y " + rea + " °R");
			}
		});		
		
		setSize(300, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Convertidor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		Ejercicio16 window = new Ejercicio16();
		
		window.setVisible(true);
//		double cel,kel,rea;
//		System.out.println("Ingresa los grados celcius a calcular a grados Kelvin y Reamur;  ");
//		Scanner sc = new Scanner(System.in);
//		cel = sc.nextDouble();
//		
//		kel = cel + 273.15;
//		rea = cel * 0.8;
//		
//		System.out.println("El valor en grados kelvin es de; "+kel+"\nEl valor en grados Réamur es de; "+rea);
//		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

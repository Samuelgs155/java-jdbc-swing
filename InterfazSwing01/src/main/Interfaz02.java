package main;

import javax.swing.JFrame;

public class Interfaz02 extends JFrame {
	
	public Interfaz02() {
		setLayout(null);
	}

	public static void main(String[] args) {
		Interfaz02 interfaz = new Interfaz02();
		interfaz.setBounds(0,0,1024,800);
		interfaz.setResizable(false);
		interfaz.setVisible(true);
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}

package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz03 extends JFrame {
	private JLabel label1;
	private JLabel label2;
	
	public Interfaz03() {
		setLayout(null);
		label1=new JLabel("Sistema de Facturación.");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2=new JLabel("Vesion 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
	}

	public static void main(String[] args) {
		Interfaz03 interfaz = new Interfaz03();
		interfaz.setBounds(0,0,300,200);
		interfaz.setResizable(false);
		interfaz.setVisible(true);
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

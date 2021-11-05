package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz01 extends JFrame {
	
	private JLabel label1;
	
	public Interfaz01() {
		setLayout(null);
        label1=new JLabel("Hola Mundo.");
        label1.setBounds(10,20,200,30);
        add(label1);
	}
	
	
	public static void main(String[] args) {
		Interfaz01 formulario1=new Interfaz01();
        formulario1.setBounds(10,10,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

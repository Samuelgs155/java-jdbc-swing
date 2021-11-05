package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz04 extends JFrame {
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	public Interfaz04() {
		setLayout(null);
		label1=new JLabel("Rojo.");
        label1.setBounds(10,20,100,30);
        add(label1);
        label2=new JLabel("Verde.");
        label2.setBounds(10,60,100,30);
        add(label2);
        label3=new JLabel("Azul.");
        label3.setBounds(10,100,100,30);
        add(label3);
	}

	public static void main(String[] args) {
		Interfaz04 interfaz = new Interfaz04();
		interfaz.setBounds(0,0,300,200);
		interfaz.setResizable(false);
		interfaz.setVisible(true);
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

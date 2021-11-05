package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Interfaz05 extends JFrame implements ActionListener{
	
	private JButton boton1;
	
	public Interfaz05() {
		setLayout(null);
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
            System.exit(0);
        }
		
	}
	
	public static void main(String[] args) {
		Interfaz05 interfaz = new Interfaz05();
		interfaz.setBounds(0,0,450,350);
		interfaz.setResizable(false);
		interfaz.setVisible(true);
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

}

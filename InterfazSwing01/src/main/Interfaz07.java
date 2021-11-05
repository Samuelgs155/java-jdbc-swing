package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Interfaz07 extends JFrame implements ActionListener{
	
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	
	public Interfaz07() {
		setLayout(null);
        boton1=new JButton("varón");
        boton1.setBounds(10,10,90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("mujer");
        boton2.setBounds(110,10,90,30);
        add(boton2);
        boton2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
            setTitle("varón");
        }
        if (e.getSource()==boton2) {
            setTitle("mujer");
        }
		
	}
	
	public static void main(String[] args) {
		Interfaz07 interfaz = new Interfaz07();
		interfaz.setBounds(0,0,220,200);
		interfaz.setResizable(false);
		interfaz.setVisible(true);
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

}

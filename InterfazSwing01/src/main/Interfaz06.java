package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Interfaz06 extends JFrame implements ActionListener{
	
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	
	public Interfaz06() {
		setLayout(null);
        boton1=new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
        boton3=new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
            setTitle("boton 1");
        }
        if (e.getSource()==boton2) {
            setTitle("boton 2");
        }
        if (e.getSource()==boton3) {
            setTitle("boton 3");
        }
		
	}
	
	public static void main(String[] args) {
		Interfaz06 interfaz = new Interfaz06();
		interfaz.setBounds(0,0,350,200);
		interfaz.setResizable(false);
		interfaz.setVisible(true);
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

}

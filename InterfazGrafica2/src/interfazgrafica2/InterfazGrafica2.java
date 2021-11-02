
package interfazgrafica2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InterfazGrafica2 extends JFrame implements ActionListener {
    
    private JLabel jLabelVisualizaContador;
    private JButton jButtonContar;
    private JButton jButtonSalir;
    private int contador = 0;
  
    public InterfazGrafica2() {
        setSize(700,500);
        setTitle("Contador de pulsaciones de botón");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ubicarComponentes();
        setVisible(true);
    }

    
    
    private void ubicarComponentes() {
     
        setLayout(null);
                   // CONFIGURACIÓN JLabel jLabelVisualizaContador
        jLabelVisualizaContador = new JLabel("Numero de pulsaciones: "+contador);
        jLabelVisualizaContador.setBounds(100,50,300,20);
        add(jLabelVisualizaContador);
                   // CONFIGURACIÓN JButton jButtonContar
        jButtonContar = new JButton("Contar");
        jButtonContar.setBounds(100,300,100,40);   
        jButtonContar.addActionListener(this);    // REGISTRO DE ESCUCHA DE EVENTO DE BOTON
        add(jButtonContar);
                   // CONFIGURACIÓN JButton jButtonSalir
        jButtonSalir = new JButton("Salir");
        jButtonSalir.setBounds(100,400,100,40);
        jButtonSalir.addActionListener(this);     // REGISTRO DE ESCUCHA DE EVENTO DE BOTON
        add(jButtonSalir);
    }
    

    
    public void actionPerformed(ActionEvent e) { 
        JButton jButton = (JButton) e.getSource();
  
        if (jButton == jButtonContar)
         { contador ++;
           jLabelVisualizaContador.setText("Numero de pulsaciones: "+contador);
         }
        else
           if (jButton == jButtonSalir)
               System.exit(0);
    }

    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
              @Override
              public void run() {
                 new InterfazGrafica2();
              }
           });        
    } 
}

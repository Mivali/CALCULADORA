package calculadora;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * calculadora.java 
 * 
 * @author Miriam
 * @version 5.0
 * 
 */
public class calculadora extends JFrame{
	
	public JButton boton;
	public JPanel panel;
	public JTextArea area;
		
	
	public calculadora() {
		this.setSize(400,600);
		this.setTitle("CALCULADORA");
		this.setLocationRelativeTo(null);
		
		panel();
		crear_boton();
		ventana_texto();
		this.setVisible(true);
		
				
	}	
	
	
	
	private void panel() {
			
		panel=new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}
		
			
	private void crear_boton() {
		
		JButton boton_0=new JButton("0");
		boton_0.setBounds(140,450,50,50);
		panel.add(boton_0);
		
		JButton boton_1=new JButton("1");
		boton_1.setBounds(85,390,50,50);
		panel.add(boton_1);
		
		JButton boton_2=new JButton("2");
		boton_2.setBounds(140,390,50,50);
		panel.add(boton_2);
		
		JButton boton_3=new JButton("3");
		boton_3.setBounds(195,390,50,50);
		panel.add(boton_3);
		
		JButton boton_4=new JButton("4");
		boton_4.setBounds(85,330,50,50);
		panel.add(boton_4);
		
		JButton boton_5=new JButton("5");
		boton_5.setBounds(140,330,50,50);
		panel.add(boton_5);
		
		JButton boton_6=new JButton("6");
		boton_6.setBounds(195,330,50,50);
		panel.add(boton_6);
		
		JButton boton_7=new JButton("7");
		boton_7.setBounds(85,270,50,50);
		panel.add(boton_7);
		
		JButton boton_8=new JButton("8");
		boton_8.setBounds(140,270,50,50);
		panel.add(boton_8);
		
		JButton boton_9=new JButton("9");
		boton_9.setBounds(195,270,50,50);
		panel.add(boton_9);
		
		JButton boton_mas=new JButton("+");
		boton_mas.setBounds(250,390,50,50);
		panel.add(boton_mas);
		
		JButton boton_menos=new JButton("-");
		boton_menos.setBounds(250,330,50,50);
		panel.add(boton_menos);
		
		JButton boton_producto=new JButton("*");
		boton_producto.setBounds(250,270,50,50);
		panel.add(boton_producto);
		
		JButton boton_division=new JButton("÷");
		boton_division.setBounds(250,210,50,50);
		panel.add(boton_division);
		
		JButton boton_igual=new JButton("=");
		boton_igual.setBounds(250,450,50,50);
		panel.add(boton_igual);
		
		JButton boton_c=new JButton("C");
		boton_c.setBounds(85,145,50,50);
		panel.add(boton_c);
		
		JButton boton_decimal=new JButton(",");
		boton_decimal.setBounds(195,450,50,50);
		panel.add(boton_decimal);
		
		JButton boton_simbolo=new JButton("±");
		boton_simbolo.setBounds(85,450,50,50);
		panel.add(boton_simbolo);
	
	}
	
	public void ventana_texto() {
		
		JTextArea area=new JTextArea();
		area.setBounds(85,80,215,40);
		panel.add(area);
		
		
		
		
	}

}

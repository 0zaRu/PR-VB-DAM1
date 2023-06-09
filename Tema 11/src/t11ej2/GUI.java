package t11ej2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class GUI extends JFrame{
	static final long serialVersionUID = 1;
	
	private JTextField archivo = new JTextField();
	
	GUI(){
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setLayout(new BorderLayout());
		//falta centrar y separar botones
		add(new JPanel(), BorderLayout.NORTH);
		
		archivo.setAlignmentY(TOP_ALIGNMENT);
		archivo.setAlignmentX(LEFT_ALIGNMENT);
		add(archivo, BorderLayout.CENTER);
		
		Botonera botonera = new Botonera();
		JPanel contentBoton = new JPanel();
		contentBoton.setLayout(new FlowLayout());

		contentBoton.add(botonera);
		add(contentBoton, BorderLayout.SOUTH);
		
		setSize(600, 550);
		setLocation(550, 260);
		setTitle("Lector de archivos txt");
	}
	
	/*public setArchivo(String[] lineas) {
		archivo
	}*/
	
	public static void main(String[] args) {
		GUI lectorTxt = new GUI();
		lectorTxt.setVisible(true);
	}
}

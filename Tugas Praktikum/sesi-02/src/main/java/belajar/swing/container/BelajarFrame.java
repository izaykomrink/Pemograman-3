package belajar.swing.container;

import javax.swing.JFrame;

public class BelajarFrame{
	public static void main(String[] xx){
		//membuat object fr yang bertipe JFrame
		JFrame fr = new JFrame();
		//Judul frame
		fr.setTitle("Belajar Frame");
		//ukuran frame
		fr.setSize(800,600);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//fr.setUndecorated(false);
		fr.setResizable(false);
		fr.setVisible(true);
	}
}
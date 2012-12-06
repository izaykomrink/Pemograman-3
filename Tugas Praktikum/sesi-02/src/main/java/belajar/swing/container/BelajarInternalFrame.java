package belajar.swing.container;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class BelajarInternalFrame{
	public static void main(String[] xx) throws Exception{
		//membuat object fr yang bertipe JFrame
		JFrame fr = new JFrame();
		//Judul frame
		fr.setTitle("Belajar Internal Frame");
		//ukuran frame
		fr.setSize(800,600);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDesktopPane jdp = new JDesktopPane();
		
		JInternalFrame ifr = new JInternalFrame();
		ifr.setTitle("Ini Internal Frame");
		ifr.setSize(200,200);
		ifr.setClosable(true);
		ifr.setResizable(true);
		ifr.setIconifiable(true);
		jdp.add(ifr);
		jdp.setVisible(true);
		
		fr.setContentPane(jdp);
		fr.setVisible(true);
	}
}
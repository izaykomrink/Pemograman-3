package belajar.swing.container;

import javax.swing.JFrame;
import javax.swing.JDialog;

public class BelajarDialog{
	public static void main(String[] xx) throws Exception{
		//membuat object fr yang bertipe JFrame
		JFrame fr = new JFrame();
		//Judul frame
		fr.setTitle("Belajar Dialog");
		//ukuran frame
		fr.setSize(800,600);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setVisible(true);
		
		JDialog jd =  new JDialog();
		jd.setSize(200,200);
		jd.setLocationRelativeTo(fr);
		jd.setTitle("Dialog Box");
		jd.setModal(false);
		jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		//delay dulu 5 detik
		Thread.sleep(5 * 1000);
		
		//tampilkan dialog
		jd.setVisible(true);
	}
}
//class berada di folder com.artivisi.project
package com.artivisi.project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class HaloSwing{
	//method utama yang akan dijalankan oleh java
	public static void main(String[] xx){
		//membuat object fr
		JFrame fr = new JFrame();
		//membuat object title 
		fr.setTitle("Halo Swing");
		
		//membuat pesan dialog dengan mengirim nilai null dengan pesan halo dialog
		JOptionPane.showMessageDialog(null, "Halo Dialog");
		//menentukan ukuran frame
		fr.setSize(200,200);
		fr.setVisible(true);
		
		//untuk memanggil method baru
		JPanel pnl = new JPanel();
		fr.add(pnl);
	}
}
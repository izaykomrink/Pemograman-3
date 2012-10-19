import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPanel;

import java.awt.*;
import javax.swing.*;


public class EntryData{
	private JFrame frame;
	private JLabel lHeader;
	private JLabel lNim;
	private JLabel lNama;
	private JLabel lHobi;
	private JLabel lJekel;
	private JTextField tfNim;
	private JTextField tfNama;
	private JCheckBox cbFS;
	private JCheckBox cbBS;
	private JCheckBox cbSG;
	private JRadioButton rbLK;
	private JRadioButton rbPR;
	private JButton bOk;
	private JButton bCancel;
		
		
		public EntryData(){
			
				frame = new JFrame("Sukma Wijaya - 4510210001");
				
					lNim = new JLabel("NIM : ");
					lNama = new JLabel("Nama :");
					lHobi = new JLabel("Hobi :");
					lJekel = new JLabel("Jenis Kelamin : ");
					tfNim = new JTextField(20);
					tfNama = new JTextField(20);
					
					cbFS = new JCheckBox("Fitnes");
					cbBS = new JCheckBox("Jogging");
					cbSG = new JCheckBox("Musik");
					
					rbLK = new JRadioButton("Laki - Laki");
					rbPR = new JRadioButton("Perempuan");
					
					
					bOk = new JButton("Ok");
					bCancel = new JButton("Cancel");
					
					ButtonGroup group = new ButtonGroup();
					group.add(rbLK);
					group.add(rbPR);
						
		JPanel pGrid1 = new JPanel(new GridLayout(4,1));
		JPanel pGrid2 = new JPanel(new GridLayout(4,1));
		JPanel pflow = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
		JPanel pborder = new JPanel(new BorderLayout());
		
		JPanel pCheck = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		JPanel pRadio = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		JPanel ptf1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel ptf2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel pl1 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,8));
		JPanel pl2 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,7));
		JPanel pl3 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,5));
		JPanel pl4 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,2));
		JPanel pheader = new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
		JPanel pfooter = new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
		
		pCheck.add(cbFS);
		pCheck.add(cbBS);
		pCheck.add(cbSG);
		
		pRadio.add(rbLK);
		pRadio.add(rbPR);
		
		ptf1.add(tfNim);
		ptf2.add(tfNama);
		
		pl1.add(lNim);
		pl2.add(lNama);
		pl3.add(lHobi);
		pl4.add(lJekel);
		
		
		pfooter.add(bOk);
		pfooter.add(bCancel);
		
		pGrid1.add(pl1);
		pGrid1.add(pl2);
		pGrid1.add(pl3);
		pGrid1.add(pl4);
		
		pGrid2.add(ptf1);
		pGrid2.add(ptf2);
		pGrid2.add(pCheck);
		pGrid2.add(pRadio);
		
		pflow.add(pGrid1);
		pflow.add(pGrid2);
		
		pborder.add(pheader,"North");
		pborder.add(pfooter,"South");
		pborder.add(pflow,"Center");
		
		frame.getContentPane().add(pborder);
		
		frame.setSize(500,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
		}
	
		public static void main(String[] args){
			new EntryData();
	}
	}
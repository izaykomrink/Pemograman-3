package tugas.akhir.pemrograman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class Login{
	private static final JTable tabel = new JTable();
	private static final JTable table = new JTable();
	private static final List<User> data = sampleData();
	private static final List<Transaksi> dt = sample();
	
	private static List<User> sampleData(){
		List<User> data = new ArrayList<User>();
		
		User m1 = new User();
		m1.setUsername("Jay");
		m1.setNama("Sukma wijaya");
		m1.setEmail("izay_tea@yahoo.com");
		m1.setJenis("Pria");
		data.add(m1);
		
		User m2 = new User();
		m2.setUsername("Irvan");
		m2.setNama("Irvan Abdurrahman");
		m2.setEmail("irvan_chester@ymail.com");
		m2.setJenis("Pria");
		data.add(m2);
				
		return data;
	}
	
	private static List<Transaksi> sample(){
		List<Transaksi> dt = new ArrayList<Transaksi>();
		
		Transaksi t1 = new Transaksi();
		t1.setMerk("Asus");
		t1.setStatus("Belum Terjual");
		dt.add(t1);
		
		Transaksi t2 = new Transaksi();
		t2.setMerk("Acer");
		t2.setStatus("Terjual");
		dt.add(t2);
				
		return dt;
	}
	public Login(){
		final JFrame frame = new JFrame("Login");
		JLabel lJudul = new JLabel("== SILAHKAN LOGIN ==", SwingConstants.CENTER);
		lJudul.setFont(new Font("Serif", Font.BOLD,20));
		JLabel lUserName = new JLabel("                   User Name");
		JLabel lPassword = new JLabel("                   Password");
		
		final JTextField tfUserName = new JTextField(15);
		final JPasswordField pfPassword = new JPasswordField(15);
		
		JButton bOk = new JButton("Login");
		JButton bCancel = new JButton("Cancel");
		
		//Panel
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,2));
		panel1.add(lUserName);
		panel1.add(tfUserName);
		panel1.add(lPassword);
		panel1.add(pfPassword);
		
		//Mengatur letak
		lJudul.setBounds(new Rectangle(0,30,480,30));
		panel1.setBounds(new Rectangle(50,80,300,50));
		bOk.setBounds(new Rectangle(200,135,70,25));
		bCancel.setBounds(new Rectangle(275,135,75,25));
		
		//masukkan ke dalam kontainer
		Container kontainer = new Container();
		kontainer = frame.getContentPane();
		kontainer.setLayout(null);
		kontainer.add(lJudul);
		kontainer.add(panel1);
		kontainer.add(bOk);
		kontainer.add(bCancel);		
		
		class CancelListener implements ActionListener{
			public void actionPerformed(ActionEvent event){
				tfUserName.setText(null);
				pfPassword.setText(null);
				tfUserName.requestFocus();
			}
		}
		CancelListener cl = new CancelListener();
		bCancel.addActionListener(cl);
		
		bOk.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
							JFrame fr = new JFrame("Penjualan");
								fr.setSize(800,600);
		
							//Membuat tab
							JTabbedPane isi = new JTabbedPane();
							isi.setTabPlacement(JTabbedPane.TOP);
							fr.getContentPane().add(isi);
		
						/*================ Start Tab User =================*/
							JLabel lUserName = new JLabel("                   User Name  ");
							JLabel lNamaLengkap = new JLabel("                   Nama Lengkap  ");
							JLabel lEmail = new JLabel("                   Email  ");
							JLabel lPassword = new JLabel("                   Password  ");
							JLabel lJenisKelamin = new JLabel("                   Jenis Kelamin  ");
							final JComboBox comboJenis = new JComboBox();
							String jenis[] = {"== Pilih ==","Pria","Wanita"};
								for(int i=0;i<jenis.length;i++)
										comboJenis.addItem(jenis[i]);
				
							/*JRadioButton rbPria = new JRadioButton("Pria");
							JRadioButton rbWanita = new JRadioButton("Wanita");
		
							ButtonGroup bgJenis = new ButtonGroup();
							bgJenis.add(rbPria);
							bgJenis.add(rbWanita);*/
		
							final JTextField tfUserName = new JTextField(15);
							final JTextField tfNamaLengkap = new JTextField(15);
							final JTextField tfEmail = new JTextField(15);
							final JPasswordField pfPassword = new JPasswordField(15);
		
							JButton bSimpan = new JButton("Simpan");
							JButton bBatal= new JButton("Batal");
							JButton bEdit = new JButton("Edit");
							JButton bHapus = new JButton("Hapus");
							
							TabelUser model = new TabelUser(data);
							tabel.setModel(model);
		
							tabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
							JScrollPane scrTabel = new JScrollPane(tabel);
		
							JPanel pnlJenis = new JPanel();
							pnlJenis.setLayout(new GridLayout(5,5));
							pnlJenis.add(lUserName);
							pnlJenis.add(tfUserName);
							pnlJenis.add(lNamaLengkap);
							pnlJenis.add(tfNamaLengkap);
							pnlJenis.add(lEmail);
							pnlJenis.add(tfEmail);
							pnlJenis.add(lPassword);
							pnlJenis.add(pfPassword);
							pnlJenis.add(lJenisKelamin);
							pnlJenis.add(comboJenis);
													
							/*pnlJenis.add(rbPria);
							pnlJenis.add(rbWanita);*/
		
							pnlJenis.setBounds(new Rectangle(-30,40,350,130));
							scrTabel.setBounds(new Rectangle(90, 280, 600, 100));
							bSimpan.setBounds(new Rectangle(35,180,80,25));
							bBatal.setBounds(new Rectangle(120,180,80,25));
							bEdit.setBounds(new Rectangle(520,245,80,25));
							bHapus.setBounds(new Rectangle(605,245,80,25));
							
		
							Container kontainer = new Container();
							JFrame user = new JFrame();
							kontainer = user.getContentPane();
							kontainer.setLayout(null);
							kontainer.add(pnlJenis);
							kontainer.add(scrTabel);
							kontainer.add(bSimpan);
							kontainer.add(bBatal);
							kontainer.add(bEdit);
							kontainer.add(bHapus);
							isi.addTab("User", kontainer);
							
							class CancelListener implements ActionListener{
									public void actionPerformed(ActionEvent event){
											tfUserName.setText(null);
											tfNamaLengkap.setText(null);
											tfEmail.setText(null);
											//comboJenis(null);
											pfPassword.setText(null);
											tfUserName.requestFocus();
							}
						}
						CancelListener c = new CancelListener();
						bBatal.addActionListener(c);
							
						/*================ End Tab User =================*/
		
						/*================ Start Tab Transaksi =================*/
							JLabel lMerk = new JLabel("                Merk");
							JLabel lStatus = new JLabel("                Status");
							JComboBox comboStatus = new JComboBox();
							String status[] = {"= Status =","Terjual","Belum Terjual"};
							for(int i=0;i<status.length;i++)
								comboStatus.addItem(status[i]);
							JButton bsmp = new JButton("Simpan");
							JButton bbtl = new JButton("Batal");
							JButton bedit = new JButton("Edit");
							JButton bhapus = new JButton("Hapus");
							final JTextField tfMerk = new JTextField(15);
							
							TabelTransaksi md = new TabelTransaksi(dt);
							table.setModel(md);
		
							table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
							JScrollPane scrTable = new JScrollPane(table);
			
							JPanel pnlTrans = new JPanel();
							pnlTrans.setLayout(new GridLayout(2,2));
							pnlTrans.add(lMerk);
							pnlTrans.add(tfMerk);
							pnlTrans.add(lStatus);
							pnlTrans.add(comboStatus);
		
							pnlTrans.setBounds(new Rectangle(-30,40,230,55));
							bsmp.setBounds(new Rectangle(25,105,80,25));
							bbtl.setBounds(new Rectangle(110,105,80,25));
							scrTable.setBounds(new Rectangle(200, 200, 350, 100));
							bedit.setBounds(new Rectangle(380,165,80,25));
							bhapus.setBounds(new Rectangle(465,165,80,25));
	
							Container kont = new Container();
							JFrame transaksi = new JFrame();
							kont =  transaksi.getContentPane();
							kont.setLayout(null);
							kont.add(pnlTrans);
							kont.add(scrTable);
							kont.add(bsmp);
							kont.add(bbtl);
							kont.add(bedit);
							kont.add(bhapus);
							isi.addTab("Transaksi Penjualan", kont);
							
							class Cancel implements ActionListener{
									public void actionPerformed(ActionEvent event){
											tfMerk.setText(null);
											//comboJenis(null);
											tfMerk.requestFocus();
							}
						}
						Cancel batal = new Cancel();
						bbtl.addActionListener(batal);
						/*================ End Tab Transaksi=================*/
		
						/*================ Start Tab Produk =================*/
							JLabel lbMerk = new JLabel("                Merk");
							JLabel lType = new JLabel("                Type");
							JLabel lHarga = new JLabel("                Harga");
							JButton bsave = new JButton("Simpan");
							JButton bcancel = new JButton("Batal");
							JButton bedit = new JButton("Edit");
							JButton bhapus = new JButton("Hapus");
									
							final JTextField tMerk = new JTextField(15);
							final JTextField tfType = new JTextField(15);
							final JTextField tfHarga = new JTextField(15);
		
							JPanel pnlProduk = new JPanel();
							pnlProduk.setLayout(new GridLayout(3,3));
							pnlProduk.add(lbMerk);
							pnlProduk.add(tMerk);
							pnlProduk.add(lType);
							pnlProduk.add(tfType);
							pnlProduk.add(lHarga);
							pnlProduk.add(tfHarga);
		
							pnlProduk.setBounds(new Rectangle(-30,30,260,75));
							bsave.setBounds(new Rectangle(25,115,80,25));
							bcancel.setBounds(new Rectangle(110,115,80,25));
							bedit.setBounds(new Rectangle(380,165,80,25));
							bhapus.setBounds(new Rectangle(465,165,80,25));
	
	
							Container k = new Container();
							JFrame produk = new JFrame();
							k =  produk.getContentPane();
							k.setLayout(null);
							k.add(pnlProduk);
							k.add(bsave);
							k.add(bcancel);
							kont.add(bedit);
							kont.add(bhapus);
							isi.addTab("Produk", k);
							
							class Batal implements ActionListener{
									public void actionPerformed(ActionEvent event){
											tMerk.setText(null);
											tfType.setText(null);
											tfHarga.setText(null);
											//comboJenis(null);
											tMerk.requestFocus();
							}
						}
						Batal b = new Batal();
						bcancel.addActionListener(b);
						/*================ End Tab Produk=================*/
		
		
		
		class ListenerUntukMouse implements MouseListener{
				public void mouseClicked(MouseEvent e){
					System.out.println("Mouse diklik");
					Component sumberEvent = e.getComponent();
					System.out.println("Komponen : " +sumberEvent.getClass().getName());
					
					if(JButton.class.isAssignableFrom(sumberEvent.getClass())){
							JButton btn = (JButton) sumberEvent;
							System.out.println("Label : " +btn.getText());
					}
					
					switch(e.getButton()){
						case MouseEvent.BUTTON1:
							System.out.println("Klik tombol kiri");
							break;
						case MouseEvent.BUTTON2:
							System.out.println("Klik tombol tengah");
							break;
						case MouseEvent.BUTTON3:
							System.out.println("Klik tombol kanan");
							break;
						default:
							System.out.println("Tombol tidak dikenali");
					}
					
					int jumlahKlik = e.getClickCount();
					System.out.println("Diklik " + jumlahKlik + "kali");
				}
				
				public void mousePressed(MouseEvent e){}
				public void mouseReleased(MouseEvent e){}
				public void mouseEntered(MouseEvent e){
					System.out.println("Mouse enter");
				}
				public void mouseExited(MouseEvent e){
					System.out.println("Mouse exit");
				}
		}
				
		ListenerUntukMouse l = new ListenerUntukMouse();
		
		//5 Tampilkan
		fr.setLocationRelativeTo(null);
		frame.setVisible(false);
		fr.setVisible(true);
		}
		});
		ImageIcon icon = new ImageIcon("images/logo.jpg");
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(490,250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new Login();
		
	}
}
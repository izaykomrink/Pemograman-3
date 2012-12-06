
package tugas.akhir.pemrograman;

import javax.swing.table.AbstractTableModel;

import java.util.List;
import java.util.ArrayList;

public class TabelUser extends AbstractTableModel{
	private String[] namaKolom = new String[]{"User Name","Nama Lengkap","Email","Jenis Kelamin"};
	
	private List<User> dataUser = new ArrayList<User>();
	
	public TabelUser(List<User> data){
		this.dataUser = data;
	}
	
	public String getColumnName(int col){
		return namaKolom[col].toString();
	}
	public int getRowCount(){ return dataUser.size();}
	public int getColumnCount(){ return namaKolom.length;}
	public Object getValueAt(int baris, int kolom){
		User m = dataUser.get(baris);
		
		switch(kolom){
			case 0: return m.getUsername();
			case 1: return m.getNama();
			case 2: return m.getEmail();
			case 3: return m.getJenis();
			default: return null;
		}
	}
	
	public boolean isCellEditable(int row, int col){ return true;}
	public void setValue(Object value, int baris, int kolom){
		User m = dataUser.get(baris);
		String isi = (String) value;
		
		switch(kolom){
			case 0: m.setUsername(isi);break;
			case 1: m.setNama(isi);break;
			case 2: m.setEmail(isi);break;
			case 3: m.setJenis(isi);break;
			default: break;
		}
		fireTableCellUpdated(baris, kolom);
	}
}
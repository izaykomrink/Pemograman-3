package tugas.akhir.pemrograman;

import javax.swing.table.AbstractTableModel;

import java.util.List;
import java.util.ArrayList;

public class TabelTransaksi extends AbstractTableModel{
	private String[] namaKolom = new String[]{"Merk","Status"};
	
	private List<Transaksi> dataTransaksi = new ArrayList<Transaksi>();
	
	public TabelTransaksi(List<Transaksi> data){
		this.dataTransaksi = data;
	}
	
	public String getColumnName(int col){
		return namaKolom[col].toString();
	}
	public int getRowCount(){ return dataTransaksi.size();}
	public int getColumnCount(){ return namaKolom.length;}
	public Object getValueAt(int baris, int kolom){
		Transaksi t = dataTransaksi.get(baris);
		
		switch(kolom){
			case 0: return t.getMerk();
			case 1: return t.getStatus();
			default: return null;
		}
	}
	
	public boolean isCellEditable(int row, int col){ return true;}
	public void setValue(Object value, int baris, int kolom){
		Transaksi t = dataTransaksi.get(baris);
		String isi = (String) value;
		
		switch(kolom){
			case 0: t.setMerk(isi);break;
			case 1: t.setStatus(isi);break;
			default: break;
		}
		fireTableCellUpdated(baris, kolom);
	}
}
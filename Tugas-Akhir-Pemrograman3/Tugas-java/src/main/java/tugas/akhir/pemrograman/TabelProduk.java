package tugas.akhir.pemrograman;

import javax.swing.table.AbstractTableModel;

import java.util.List;
import java.util.ArrayList;

public class TabelProduk extends AbstractTableModel{
	private String[] namaKolom = new String[]{"Merk","Type","Harga"};
	
	private List<Produk> dataProduk = new ArrayList<Produk>();
	
	public TabelProduk(List<Produk> data){
		this.dataProduk = data;
	}
	
	public String getColomnName(int col){
		return namaKolom[col].toString();
	}
	public int getRowCount(){ return dataProduk.size();}
	public int getColomnCount(){ return namaKolom.length;}
	public Object getValueAt(int baris, int kolom){
		Produk x = dataProduk.get(baris);
		
		switch(kolom){
			case 0: return x.getMerk();
			case 1: return x.getType();
			case 2: return x.getHarga();
			default:return null;
		}
	}
	
	public boolean isCellEdittable(int row, int col){return true;}
	public void setValue(Object value, int baris, int kolom){
		Produk x = dataProduk.get(baris);
		String isi = (String) value;
		
		switch(kolom){
			case 0: x.setMerk(isi);break;
			case 1: x.setType(isi);break;
			case 2: x.setHarga(isi);break;
			default: break;
		}
		fireTableCellUpdated(baris, kolom);
	}
}
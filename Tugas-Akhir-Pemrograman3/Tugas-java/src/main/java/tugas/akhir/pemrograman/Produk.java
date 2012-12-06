
package tugas.akhir.pemrograman;

public class Produk{
	private String merk;
	private String type;
	private String harga;
	
	public String getMerk(){
		return this.merk;
	}
	
	public void setMerk(String x){
		this.merk = x;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String x){
		this.type = x;
	}
	
	public String getHarga(){
		return this.harga;
	}
	
	public void setHarga(String x){
		this.harga = x;
	}
	
	public String toString(){
		return "[" +this.merk+ "] - " +this.type +this.harga;
	}
	
}
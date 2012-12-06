
package tugas.akhir.pemrograman;

public class Transaksi{
	private String merk;
	private String status;
	
	public String getMerk(){
		return this.merk;
	}
	
	public void setMerk(String x){
		this.merk = x;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public void setStatus(String x){
		this.status = x;
	}
	
	
	public String toString(){
		return "[" +this.merk+ "] - " + this.status;
	}
}
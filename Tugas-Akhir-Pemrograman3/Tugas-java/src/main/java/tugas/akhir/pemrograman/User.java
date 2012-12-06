
package tugas.akhir.pemrograman;

public class User{
	private String username;
	private String nama;
	private String email;
	private String jenis;
	
	public String getUsername(){
		return this.username;
	}
	
	public void setUsername(String x){
		this.username = x;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public void setNama(String x){
		this.nama = x;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String x){
		this.email = x;
	}
	
	public String getJenis(){
		return this.jenis;
	}
	
	public void setJenis(String x){
		this.jenis = x;
	}
	
	public String toString(){
		return "[" +this.username+ "] - " + this.nama + this.email + this.jenis;
	}
}
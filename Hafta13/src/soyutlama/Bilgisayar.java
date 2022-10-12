package soyutlama;

public abstract class Bilgisayar {
	
	String işletimsistemi;

	public Bilgisayar(String işletimsistemi) {
		super();
		this.işletimsistemi = işletimsistemi;
	}
	
	public abstract void videoOynat();
	
	public abstract void oyunOynat();
	
	public abstract void interneteBağlan();
	


}

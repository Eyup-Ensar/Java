package �okbi�imlilik;

public class Personel {
	
	String adsoyad;
	double maa�;
	int sicilno;
	int ya�;
	
	public Personel(String adsoyad, double maa�, int sicilno, int ya�) {
		super();
		this.adsoyad = adsoyad;
		this.maa� = maa�;
		this.sicilno = sicilno;
		this.ya� = ya�;
	}
	
	public void �al��() {
		System.out.println("Personel �al��t�...");
	}

	@Override
	public String toString() {
		return "Personel [adsoyad=" + adsoyad + ", maa�=" + maa� 
				+ ", sicilno=" + sicilno + ", ya�=" + ya� + "]";
	}
	
	public void izinHakk�n�Kullan(int g�n) {
		System.out.println("Personel "+g�n+" g�n izin kulland�...");
	}
}

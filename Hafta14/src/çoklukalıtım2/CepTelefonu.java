package �oklukal�t�m2;

public class CepTelefonu implements Telefon, Bilgisayar, Foto�rafMakinesi {

	@Override
	public double toplamaYap(double say�1, double say�2) {
	
		
		return say�1+say�2;
	}

	@Override
	public double ��karmaYap(double say�1, double say�2) {
		
		return say�1-say�2;
	}

	@Override
	public double b�lmeYap(double say�1, double say�2) {
		
		return say�1/say�2;
	}

	@Override
	public double �arpmaYap(double say�1, double say�2) {
		
		return say�1*say�2;
	}

	@Override
	public void foto�raf�ek() {
		
		System.out.println("Cep telefonu foto�raf �ekti...");

	}

	@Override
	public void video�ek() {
		
		System.out.println("Cep telefonu video �ekti...");
	}

	@Override
	public void interneteBa�lan() {
		
		System.out.println("Cep telefonu internete ba�land�...");
	}

	@Override
	public void dosyaA�() {
		
		System.out.println("Cep telefonu dosya a�t�...");


	}

	@Override
	public void dosyaD�zenle() {
		
		System.out.println("Cep telefonu dosya d�zenledi...");


	}

	@Override
	public void dosyaKaydet() {
		
		System.out.println("Cep telefonu dosya kaydetti...");
	}

	@Override
	public void mesajG�nder() {
		
		System.out.println("Cep telefonu mesaj g�nderdi...");
	}

	@Override
	public void aramaYap() {
		
		System.out.println("Cep telefonu arama yapt�...");
	}

}

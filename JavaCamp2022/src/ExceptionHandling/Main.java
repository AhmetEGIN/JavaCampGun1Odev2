package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		String sehir = "Ankara";
		// int sayi = sehir;  bu kod compile olmaz. 
		// Bizim try-catch ile y�netti�imiz hatalar uygulama build olduktan sonra �al��ma an�nda belli de�erlerde s�k�nt� ��karan hatalard�r
		int[] sayilar = new int[] {1,2,3};
		// System.out.println(sayilar[3]);   ArrayIndexOutOfBoundsException
		
		try {  
			// try blo�unun i�indeki kod �al���r
			// Catch ya da finally blo�unu da belirtmemiz gerekir
			System.out.println(sayilar[5]);
		}
		catch (Exception exception) {
			// e�er try blo�unda hata varsa catch blo�u �al���r
			System.out.println("hata olu�tu: " + exception.getMessage());
			System.out.println(exception);
		}
		finally {
			// finally blo�u en son �al��acak bloktur. 
			// Try ya da catch 'in �al��mas� farketmez. Finally blo�u her zaman �al���r
			System.out.println("Finally blo�u �al��t�");
			// �rne�in veri taban�na ba�land�ktan sonra hata olu�tu. Hata olu�tuktan sonra bu blok yard�m�yla veri taban� eri�imini kapatabiliriz
			// Ayn� �ekilde e�er dosya ile �al���yorsak finally blo�u ile o dosyay� kapatabiliriz.
		}
		
		try {  

			System.out.println(sayilar[5]);
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			//Hatan�n t�r�ne g�re kullan�c�y� belirli bir yere g�nderebilmeliyiz.
			// Belirli bir hatay� handle etmek istiyorsak bu hatay� parametre olarak almal�y�z.
			// Birden fazla hatay� ayr� ayr� kontrol edebilmek i�in birden fazla catch blo�u yazabiliriz.
			System.out.println("hata olu�tu: " + exception.getMessage());
			System.out.println(exception);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// Parametre olarak do�rudan Exception g�ndermek demek ayr� olarak belirtilen hatalar d���nda bir hata olu�tu�unda buras� �al���r
			System.out.println("Hata logland�: " +e);
			// �rne�in burada olu�an hata loglanabilir. Bu sayede yaz�l�mc� bu bilinmeyen hatadan haberdar edilir.
			
		}
		finally {
			System.out.println("Finally blo�u �al��t�");

		}
		
		
	}

}

package StaticDemo;

public class ProductValidator {
	// ara� amac� olan bir class kullan�m�nda static keyword� kullan�l�r.
	// Peki niye b�t�n metotlar� static yapm�yoruz:
	// bir class � newledi�imizde onun bir �rne�i olu�ur. Bu �rne�in i�i bitti�inde bellekten at�l�r
	// Fakat static tan�mlan�nca bellekten at�lmaz
	
	// bir class �n i�erisinde hem static hem de static olmayan metotlar olabiilr
	// c# 'ta static fonksiyon �al��t�r�ld���nda o class'�n constructor'� da �al���r. Java'da �al��maz
	// Bu y�zden Java'da static constructor tan�mlanmas� gerekir.
	
	static {
		System.out.println("Static yap�c� blok �al��t�");
	}
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	
	
}

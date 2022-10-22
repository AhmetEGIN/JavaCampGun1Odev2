package HashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// hashMap s�zl�klere benzer. C#'taki Dictionary gibi
		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("book", "Kitap"); // HashMap' e eleman eklemep i�in put kullan�l�r
		sozluk.put("Table", "Masa");
		sozluk.put("name", "isim");
		sozluk.put("Computer", "Bilgisayar");
		System.out.println(sozluk);
		System.out.println(sozluk.size());   // eleman say�s�n� verir
		System.out.println(sozluk.get("Table"));   // Veri �ekmek i�in key de�erini girebiliriz.
		sozluk.remove("Table");  // silmek i�in kullan�l�r
		System.out.println(sozluk.get("Table"));   // referans� olmad��� iin null d�ner
		// sozluk.clear();   hashMap'teki b�t�n elemanlar� siler
		
		System.out.println(sozluk.keySet());  // sozlukteki key leri verir.	
		for(String item : sozluk.keySet()) {
			System.out.println("Eleman: " + item + " de�er: "+ sozluk.get(item));
			
		}
		
		
		
	}
}

package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

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
		
		System.out.println(sozluk.values());
		String itemToSearch = "Kitap";
		System.out.println("-----");
		
		
		for (Entry<String, String> item : sozluk.entrySet()) {
			if (item.getValue().equals(itemToSearch)) {
				System.out.println("Key :" + item.getKey() + " / Value :" + item.getValue());
			}
		}
		
		// containsKey -- verilen key'in map in i�erisinde olup olmad���n� kontrol eder. Boolean d�nd�r�r
//		containsKey() ve containsValue() ile HashMap nesnesinde arama yapabiliriz. 
//		�ki metodda kendisine parametre verilen de�eri ilgili nesne i�erisinde bulabilirse true aksi halde false d�ner.
		// keySet sadece key'leri bar�nd�r�r
		// Java.util.Map.Entry  -- Map(HashMap) i�erisindeki key-value �iftleri ile ilgili metotlara sahiptir.
		Set<Entry<String, String>> s = sozluk.entrySet();
		System.out.println(s);
		
	}
}

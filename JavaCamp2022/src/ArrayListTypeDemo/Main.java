package ArrayListTypeDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// Java'da somut yap�lar� �al���r�z. Bu nedenle tip g�venli �al��malar yapar�z.Yani integer sa sadece integer veriler olmal�
		// Generic yap�lar kullan�larak arrayList tip g�venli hale getirilebilir
		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("�zmir");
		sehirler.add("Ankara");
		sehirler.add("�stanbul");
		
		sehirler.remove("�stanbul");  // listeden belirli bir �geyi siler
		Collections.sort(sehirler);  // S�ralama Collections class'� ile yap�l�r
		for (String sehir: sehirler) {
			System.out.println(sehir);
			
		}
	}
}

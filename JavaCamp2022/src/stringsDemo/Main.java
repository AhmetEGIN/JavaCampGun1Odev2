package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		// stringler bir karakter dizisidir. Yani char array idir.
		System.out.println(mesaj);

		System.out.println("Eleman say�s�: " + mesaj.length()); // karakter say�s�n� belirler
		System.out.println("5. Eleman: " + mesaj.charAt(4)); // belirli bir eleman� bulmak i�in charAt() kullan�l�r
		System.out.println(mesaj.concat(" Ya�as�n")); // String ifadeye ekleme yapmak i�in concat() kullan�l�r.
		System.out.println(mesaj.startsWith("B"));  // E�er B ile ba�l�yorsa true d�nd�r�r, de�ilse false d�nd�r�r
		System.out.println(mesaj.endsWith("j"));
		char[] characters = new char[10];
		mesaj.getChars(0, 5, characters, 2);   //  getChars(0(hangi karakterden ba�layacap�), 5(ka��nc� karaktere kadar alaca��, 5 i dahil etmez), 
		//characters(bu char array ini nereye aktaraca��), 2(aktar�lacak array de ka��nc� karakterden ba�layaca��))
		System.out.println(characters);
		System.out.println(mesaj.indexOf("av")); // belirtti�iniz eleman�n ilk olarak ka��nc� karakterde oldu�unu belirtir
												// bu aramada string char int ... kullan�labilir
		System.out.println(mesaj.lastIndexOf('e'));  // aramaya sa�dan ba�lar s�ray� yine soldan belirtir
		System.out.println(mesaj.lastIndexOf('a'));
		
		System.out.println("------------------------");
		
		String yeniMesaj = mesaj.replace(' ', '-');  // mesaj� e�er farkl� bir string olarak tutmak istedi�imizde yeni bir de�er tan�mlar�z
		System.out.println(mesaj.replace(' ', '-'));  // replace = de�i�tirme. Bu �rnekte bo�luk yerine - i�areti koyar
		// substring = bir metnin i�erisinden par�a almak amac� ile kullan�l�r
		System.out.println(mesaj.substring(2));  // 2. indexten sonras�n� al�r
		System.out.println(mesaj.substring(2, 4));  // 2. indexten ba�lar 4. indexe kadar gider. 4. Index dahil de�il
		// split fonksiyonu string ifadeyi belli bir karakter veya karakter dizisini dikkate alarak par�alamaya yarar
		// split bir dizi g�derir
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());  // k���k harfe �evirir
		System.out.println(mesaj.toUpperCase());  // B�Y�K HARFE �EV�R�R
		System.out.println(mesaj.trim());  // trim metodu stringin ba��ndaki ve sonundaki bo�luklar� yok eder
		
		
	}

}

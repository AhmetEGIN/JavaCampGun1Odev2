package arrayListDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,3};
		System.out.println(sayilar[0]);
		System.out.println("-------");
		// array tan�mlad���m�z zaman array'in bir s�n�r� oluyor. �rne�in yukar�daki array'in s�n�r� 3't�r.
		
		// ArrayList kullanabilmek i�in java.util paketini import etmemiz gerekir.
		ArrayList sayilar2 = new ArrayList();
		
		sayilar2.add(10);
		sayilar2.add(1000);
		sayilar2.add("Ankara");
		// arraylist'te t�r belirtmezsek int, string ... de�erleri alabilir.
		System.out.println(sayilar2.size()); // arraylist'teki eleman say�s�
		System.out.println(sayilar2.get(2));  // belirtilen indexteki de�eri verir
		sayilar2.set(0, 100); // arraylist'te bir de�eri de�i�tirmek i�in set kullan�l�r.
		// L�ste boyutndan daha b�y�k bir index verirsek program hata verir
		System.out.println(sayilar2.get(0));
		System.out.println("-------");
		sayilar2.remove(0); // listeden veri silmek i�in indexini veririz.
		System.out.println(sayilar2.get(0));   // veriyi sildi�imiz zaman bu indexin �n�ndeki de�erler bir geriye gelir.
		//sayilar2.clear();  // t�m elemanlar� siler
		System.out.println(sayilar2.size());
		System.out.println("--------");
		for(Object object : sayilar2) {
			System.out.println(object);
		}
		

		
		
		
		
	}
}

package Kullan�c�danInputAlma;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		System.out.println("Bir say� giriniz: ");
		int a = scan.nextInt();   // integer de�eri i�in kullan�l�r
		System.out.println("De�i�kenin de�eri: " + a);
		
		System.out.println("Bir say� giriniz:");  // double de�er i�in kullan�l�r
		double b = scan.nextDouble();    // baz� dillerde bu yaz�n�n yaz�m �ekli farkl�. 3.14 veya 3,14 �eklinde yaz�labilir
		// bu durumda standartlar� scan.useLocale(Locale.US) ile belirtiriz
		System.out.println(b);
		
		System.out.println("Bir metin giriniz");
		String mesaj = scan.nextLine();
		System.out.println(mesaj);
		
	}

}

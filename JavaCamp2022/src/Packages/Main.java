package Packages;
import java.util.Scanner;

import Packages.matematik.DortIslem;

public class Main {

	public static void main(String[] args) {
		// package programlamada birbiriyle ilgili �eyleri grupland�rmam�za yarar
		// Kodlar� okudu�umuz zaman mesela bir class'� arad���m�z zaman o class'� nerede arayaca��m�z� biliriz.
		// Bir paketi ba�ka bir projede de kullanabiliriz. 
		// Bu sebeplerden dolay� paket yap�s� fazlaca kullan�l�r.
		// Java'n�n i�erisinde tan�mlanm�� paketler vard�r. Bunlara built-in denir.
		// bir paketi ba�ka bir paketin i�erisinde kullanmak istersek onu import etmemiz gerekir. �mport paketler aras� ileti�im sa�lar.
		// S�kl�kla kullan�lan paketler: Veri eri�im katman�, i�lem katman�, aray�z katman�, core katman�
		// bir paketteki her class'� kullanmak istiyorsak paket ad�n�n yan�na * koyulur. �rne�in
		// import Packages.matematik.*;
		Scanner scanner = new Scanner(System.in); // Scanner console ekran�nda data okumaya yarar.

		//System.out.println("Ad�n�z");
		//String name = scanner.nextLine();
		//System.out.println("Merhaba "+ name);
		
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.Topla(1, 3));
		
		
	}
}

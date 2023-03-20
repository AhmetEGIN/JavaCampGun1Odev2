package WorkingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		createFile();
//		getFileInfo();
		// Dosya i�lemleri i�in Buffered kullan�labilir. Buffered dosyay� belle�e
		// ta��yarak i�lem yapar.
		// File class'� ise do�rudan dosya �zerinden i�lem yapar
		readFile();
		System.out.println("--------");
		writeFile();
		System.out.println("--------");
		readFile();
	}

	public static void createFile() {
		File file = new File("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\Files\\students.txt");
		// olan bir dosyan�n yolunu g�sterip o dosyay� okuyabildi�imiz gibi, yeni bir
		// dosya da olu�turabiliriz

		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("Dosya olu�turuldu");
			} else {
				System.out.println("Dosya zaten mevcut");
			}
		} catch (Exception e) {
			e.printStackTrace(); // hata mesaj�n� yazd�r�r
			System.out.println(e.getMessage()); // sadece mesaj� yazd�r�r
		}
	}

	public static void getFileInfo() {
		File file = new File("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\Files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya ad� : " + file.getName()); // dosya ad�n� verir
			System.out.println("Dosya yolu: " + file.getPath());
			System.out.println("Dosya yolu: " + file.getAbsolutePath());
			System.out.println("Dosya yaz�labilir mi :" + file.canWrite());
			System.out.println("Dosya okunabilir mi :" + file.canRead());
			System.out.println("Dosya boyutu(byte): " + file.length());
			// System.out.println("Dosya boyutu(byte): " + file.getTotalSpace());

		}
	}

	public static void readFile() {
		File file = new File("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\Files\\students.txt");
		try {
			// Scanner class'� sayesinde dosyay� okuyabiliriz
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				// bir sonraki sat�r� okuyabildi�i s�rece devam eder
				char[] line = reader.nextLine().toCharArray();
				for(char karakter : line) {
					String control = " ";
					if (control.charAt(0) == karakter) {
						System.out.println("askl");
						
					}
				}
				
			}
			// ��lemlerimiz bittikten sonra dosyay� kapatmal�y�z
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();  // dosya olmazsa kontrol alt�na almak i�in kullan�lan catch blo�u

		}

	}
	
	public static void writeFile() {
		try {
			// Dosyaya yazmak i�in FileWriter class'�na ihtiyac�m�z var
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\Files\\students.txt",true));
			// filewriter '�n sonuna append k�sm�na true eklersek dosyan�n �zerine yazar. E�er yazmazsak dosya i�erisindeki veriler kaybolur
			writer.newLine();  // yeni sat�r olu�turur
			writer.write("Salih");
			System.out.println("Dosyaya yaz�ld�");
			writer.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}

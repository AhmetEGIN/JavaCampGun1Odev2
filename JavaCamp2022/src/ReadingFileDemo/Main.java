package ReadingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\ReadingFileDemo\\sayilar.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				total += Integer.valueOf(line);
				// bir de�eri integera d�nd�rmek i�in Integer.valueOf(de�er)  kullan�l�r
				
				
			}
			System.out.println("Toplam say�: " + total);
		
		} catch (FileNotFoundException e) {
			//FileNotFoundException -- dosyan�n bulunamamas� durumunda �al���r.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			reader.close();
			// finally blo�unda dosya okuyan thread'i kapatmam�z gerekiyor.
			// Fakat buradada unhandled exception ile kar��la��yoruz. ��nk� bu kodun �al��mas� i�in dosyan�n a��lm�� olmas� gerekir
			// Buradaki sorunu ��zmek i�in class'�n yan�na throws IOException ile hata alabilece�imiz belirtilir.
			// Bu y�ntem yerine bu blok i�erisine de try-catch yaz�labilir
		}
		

	}

}

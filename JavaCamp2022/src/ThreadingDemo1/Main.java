package ThreadingDemo1;

public class Main {

	public static void main(String[] args) {
		// SingleThread bir uygulamada �nce bir operasyon yap�l�r bu operasyon bittikten sonra di�er operasyona ge�er. Operasyon s�ras� b�yle devam eder
		// MuktiThread bir uygulamada ise bir operasyon di�er operasyonun bitmesini beklemeden �al���r.
		// Burada �nemli olan durum bir operasyonun kendinden bir �nceki operasyona ba�l� olup olmamas�d�r.
		// Operasyonlar birbirine ba�l� ise multithread kullanman�n bir anlam� yoktur.
		// Ger�ek hayatta operasyonlar genelde birbirine ba�l�d�r bu y�zden singleThread kullan�l�r
		
		KronometreThread kronometreThread1 = new KronometreThread("thread1");
		KronometreThread kronometreThread2 = new KronometreThread("thread2");
		KronometreThread kronometreThread3 = new KronometreThread("thread3");
		kronometreThread1.start();
		kronometreThread2.start();
		kronometreThread3.start();
//		kronometreThread1.run();
//		kronometreThread2.run();
//		kronometreThread3.run();
		
		
		
	}

}

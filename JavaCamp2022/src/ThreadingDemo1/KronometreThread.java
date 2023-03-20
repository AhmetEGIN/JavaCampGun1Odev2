package ThreadingDemo1;

public class KronometreThread implements Runnable {
	// Runnable interface 'ini implemente ederek bu class'�n thread g�d�ml� olabilmesini sa�lad�k
	private Thread thread;
	// Thread 'leri birbirinden ay�rt edebilmek i�in onlara isim veririz
	private String threadName;

	public KronometreThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Olu�turuluyor: " + threadName);
		
	}

	@Override
	public void run() {
		System.out.println("�al��t�r�l�yor: " + threadName);

		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(threadName + ": " + i);
				Thread.sleep(1000); // Uygulamay� yava�latmak i�in kullan�l�r
			}
		} catch (InterruptedException e) {
			// InterruptedException -- Thread bozulursa olu�an hata
			System.err.println(e.getLocalizedMessage() + " " + threadName);
		}
		System.out.println("Thread bitti");

	}
	
	public void start() {
		System.out.println("Thread nesnesi olu�uyor ");
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		} 
		
	}
}

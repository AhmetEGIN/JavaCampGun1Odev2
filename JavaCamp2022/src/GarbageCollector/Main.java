package GarbageCollector;


class Meyve{
	private String name;

	public Meyve(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println(this.name+ " isimli obje ram'den silindi.");
//		finalize - obje ram�den silinirken �al���r
		// referans� olmayan objeler silinirken �apr�lan metottur
	}
	
}

public class Main {

	public static void main(String[] args) {
//		��p toplay�c�s�n�n mant��� referans olarak g�sterilemeyen alanlar�n silinmesini sa�lamakt�r.

		Meyve m1 = new Meyve("Elma");
		System.out.println(m1.getName());
		// Java ��p toplama i�lemini kendisi ger�ekle�tirir. 
		// Ama biz kendimizde garbage collector� �al��t�rabiliri.
		m1 = null;
		// Bir objenin referans�n�n null yap�lmas� durumunda unreferenced object meydana gelir.
//		System.gc();
		Meyve m2 = new Meyve("Armut");
		Meyve m3 = new Meyve("Kiraz");
		m2 = m3;
		// m2, m3 objesine e�itlendi�inde m2 objesininn eskiden g�sterdi�i alan art�k bilinmiyor.
//		System.gc();
		
		// Anonim obje olu�turursak adresi bilinmez.
		new Meyve("Karpuz");
		// Olu�turulan objenin heap'teki adresi elimizde yok.
		System.gc();
		
	}
	public static <T> void bol(int as, T item){
		
	}

}

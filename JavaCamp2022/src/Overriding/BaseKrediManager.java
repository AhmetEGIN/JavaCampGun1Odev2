package Overriding;

public class BaseKrediManager {
	public final double hesapla(double tutar) {
		
		return tutar * 1.18;
	}
	
	// bir class�n herhangi bir operasyonu aksi belirtilmedi�i s�rece overridable d�r.
	// yani herhangi bir class� inherit eden ba�ka bir class bu metodu ezebilir
	// bir metodun override edilmesini engellemek i�in final anahtar kelimesini kullanabiliriz
}

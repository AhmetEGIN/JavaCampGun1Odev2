package AbstractClasses;

public abstract class GameCalculator {
	
	// bir class�n veya operasyonun abstract keyword � ile imzalanmas� gerekir
	// bir abstract class ta bir abstract operasyon olmas� zorunlu de�ildir
	
	public abstract void hesapla();   // bu class� inherit eden classlar hesapla fonksiyonunu kendi yazmak zorunda
	public final void gameOver() {  // final anahtar kelimesi sayesinde bu class� inherit eden classlar�n bu fonksiyonu override etmesi engellenebilir
		System.out.println("Oyun bitti");
	}
}

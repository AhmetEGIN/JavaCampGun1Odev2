package SwitchDemo;

public class Main {

	public static void main(String[] args) {
		// switch, if else ye g�re daha az kullan�l�r
		char grade = 'g';
		switch (grade) {
		case 'A':
			System.out.println("M�kemmel, ge�tiniz");
			break;
		case 'B':   // iki case i�in ayn� sonucu �retir
		case 'C':
			System.out.println("�yi, ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena de�il, ge�tiniz");
		case 'F':
			System.out.println("Maalesef kald�n�z");

		default: // default bu notlar�n d���nda herhangi bir not girildi�inde �al���r
			System.out.println("Ge�ersiz bir not girdiniz");
			break;
		}

	}

}

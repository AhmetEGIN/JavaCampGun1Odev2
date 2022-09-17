package SesliHarfler;

public class Main {

	public static void main(String[] args) {
		char character = '�';
		char[] harfler = { 'A', 'I', 'U', 'O' };
		for (char harf : harfler) {
			if (harf == character) {
				System.out.println("Kal�n sesli harf");
				return;
			}
		}
		System.out.println("�nce sesli harf");

		// ikinci yol -- switch case

		switch (character) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kal�n sesli harf");
			break;
		default:
			System.out.println("�nce sesli harf");

		}

	}

}

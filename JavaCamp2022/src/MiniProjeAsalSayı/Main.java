package MiniProjeAsalSay�;

public class Main {

	public static void main(String[] args) {
		int number = 20;
		int bolum = number / 2;
		int kalan = number % 2; // remainder
		System.out.println(bolum);
		System.out.println(kalan);
		boolean isPrime = true;
		if(number == 1) {
			System.out.println("Say� asal de�ildir");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(number + ": Say� asald�r");

		} else {
			System.out.println("Say� asal de�ildir");
		}

		System.out.println("-----------");

		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				System.out.println("Say� asal de�ildir");
				break;
			}
			if (j == number - 1) {

				System.out.println("Say� asald�r");
			}
		}

		System.out.println("-------");

		int k = 2;
		while (k < number) {
			if (number % k == 0) {
				System.out.println("Say� asal de�ildir");
				break;
			}
			if (k == number - 1) {

				System.out.println("Say� asald�r");
			}
			k++;

		}

	}

}

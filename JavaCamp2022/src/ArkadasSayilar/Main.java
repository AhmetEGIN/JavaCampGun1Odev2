package ArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// en k���k iki sarkada� say�: 220-284
		// kendileri hari� poitif tam b�lenleri toplam� birbirne e�it olan say�lara
		// denir

		int number1 = 220;
		int number2 = 284;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				sum1 += i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				sum2 += i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		// && = and ba�lac�
		// || = or ba�lac�
		if (sum1 == number2 && sum2 == number1) {
			System.out.println("Bu iki say� arkada� say�d�r");
		} else {
			System.out.println("Bu iki say� arkada� say� de�ildir");

		}

	}

}

package LoopDemo;

public class Main {

	public static void main(String[] args) {
		// For
		for(int i=0;i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For d�ng� bitti");
		
		// While
		System.out.println("While d�ng�s�");
		int i =0;
		while (i<=10) {
			System.out.println(i);
			i ++;
		}
		System.out.println("While d�ng�s� bitti");
		
		System.out.println("Do-While d�ng�s�");
		// do while
		// do- while d�ng�s�n�n while d�ng�s�nden fark�: do-while d�ng�s�nde �art sa�lanmasa bile 1 kere �el���r
		// ancak while d�ng�s�nde �art�n sa�lanmas� gerekir
		int j = 100;
		do {
			System.out.println(j);
			j +=2;
		}
		while(j<=10);
		
		
		
		
	}

}

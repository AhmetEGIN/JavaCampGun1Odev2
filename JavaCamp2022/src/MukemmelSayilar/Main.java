package MukemmelSayilar;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// m�kemmel say�= m�kemmel say� kendinden ba�ka pozitif t�m tam b�lenlerinin toplam� kendisine e�it olan say�d�r
		// �rne�im 6. 6: 1/2/3 ' e b�l�n�r. 3+2+1=6
		
		int number = 7;
		int sum = 0;
		for(int i=1;i<number;i++) {
			if(number % i == 0) {
				sum +=i;
			}
			
		}
		if (sum==number) {
			System.out.println("Bu say� m�kemmel say�d�r");
		} else {
			System.out.println("Bu say� m�kemmel say� de�ildir");
		}
		

	}

}

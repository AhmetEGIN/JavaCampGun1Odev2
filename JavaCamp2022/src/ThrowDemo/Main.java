package ThrowDemo;

public class Main {

	public static void main(String[] args) {
		// �rne�in bir tane paket haz�rlad�k. Bu paketi ba�ka bir yerde kullan�lacak.
		// haz�rlad���m�z pakette yap�lan i�lemlerde throw ifadesi ile hata f�rlat�r�z. Bunun amac� bu paketi kullanacak olan ki�i
			// bu hatadan haberi olsun.
		
		AccountManager manager = new AccountManager();
		manager.deposit(100);
		System.out.println("Hesap: " + manager.getBalance());
		try {
			manager.withdraw(200);
			
		} catch (BalanceInsufficentException e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("Hesap: " + manager.getBalance());
	}

}

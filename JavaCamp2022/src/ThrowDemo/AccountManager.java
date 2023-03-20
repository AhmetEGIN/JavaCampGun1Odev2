package ThrowDemo;

public class AccountManager {

	private double balance;

	public double getBalance() {
		return balance;
	}
	// para yat�rma i�lemi
	public void deposit(double amount) {
		balance = getBalance() +amount;
	}
	


	// hesaptan para �ekme
	// metodun yan�na throws Exception yazsak da olur. Ancak daha detayl� olmas� i�in Custom Exception u da yazabiliriz.
	public void withdraw(double amount) throws BalanceInsufficentException {
		
		if (balance>= amount) {
			balance = getBalance() - amount;
			
		} else {
			//throw new Exception("Bakiye yetersiz");
			// Burada genel bir Exception f�rlatmak yerine daha uygun custom Exception f�rlatabiliriz.
			// �rne�in throw new BalanceInsufficentException();
			throw new BalanceInsufficentException("Bakiye Yetersiz");
			
		}
		
	}
	
	
	

}

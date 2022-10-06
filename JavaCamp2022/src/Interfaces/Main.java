package Interfaces;

public class Main {

	public static void main(String[] args) {
		// classlar�n i�erisinde metot koydu�umuz zaman bu metotlar�n i�inin doldurulmas� gerekir
		// abstract classlarda bo� metot b�rak�l�rsa onu inherit eden class doldurmak zorunda
		// interface ise sadece metotlar�n imzalar�n� i�erir. Onu implemente eden bu metotlar� doldurur
		// interfaceler newlenemez
		// operasyon implemente edilmesi gerekiyorsa interface kullan�l�r
		// interfaceler kendini implemente eden classlar�n referans�n� tutabilir
		// ICustomerDal customerDal = new MySqlCustomerDal();
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		
		

	}
}

package AbstractDemo;

public class Main {

	public static void main(String[] args) {
		// Bir m��terinin veri taban�na kaydedilmesi
		// Oracle, MsSql, MySql gibi farkl� veri tabanlar� kullan�lacak
		// 
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new SqlServerDatabaseManager();
		customerManager.getCustomers();

	}

}

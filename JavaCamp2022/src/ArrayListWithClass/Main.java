package ArrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Class'lar ile de arrayList kullan�labilir.
		// Bir veri kayna��nda m��teriler var diyelim. Bu m��terileri bir listeye koyabiliriz.
		Customer customer1 = new Customer(1, "Ahmet", "EG�N");
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(new Customer(2, "Engin", "Demiro�"));
		customers.add(new Customer(3, "Derin", "Demiro�"));
		
		for (Customer customer : customers) {
			System.out.println(customer.firstName + customer.lastName);
		}
		System.out.println("-------------");
		// bir nesneyi sildi�imiz zaman onu newleyip bulamay�z
		// customers.remove(new Customer(2, "Engin", "Demiro�")); burada farkl� bir referans olu�aca�� i�in bu nesne silinmez
		customers.remove(customer1);  // bu durumda referans� verdi�imiz i�in silinir
		for (Customer customer : customers) {
			System.out.println(customer.firstName + customer.lastName);
		}
		
		System.out.println("************");
		String name = "Engin";
		
		Customer personToDelete ;
		for(Customer customer : customers) {
			if(customer.firstName == name) {
				personToDelete = customer;
				customers.remove(personToDelete);
			}
		}
		for (Customer customer : customers) {
			System.out.println(customer.firstName + customer.lastName);
		}
	}

}

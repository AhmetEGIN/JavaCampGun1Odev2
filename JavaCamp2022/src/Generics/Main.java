package Generics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// java, c# gibi diller tip g�venli dillerdir.
		ArrayList demo = new ArrayList();
		demo.add(2);
		demo.add("ANkara");
		// ArrayList'in default halinde her tip listeye eklenebilir. Object tipindedir
		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("�stanbul");
		sehirler.add("�zmir");
		// Tip g�venli  �al��mak i�in genericlerden faydalan�r�z
		// �rne�in veri taban� ile i�lem yap�lacaksa veri taban� nesnesi isteriz. Mesela Veri taban�na Validation class'� g�ndermek istemeyiz
		
		Customer customer = new Customer();
		MyList<Customer> customers = new MyList<Customer>();
		customers.add(customer);
		
	}
}

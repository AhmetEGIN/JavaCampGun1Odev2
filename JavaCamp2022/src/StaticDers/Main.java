package StaticDers;

public class Main {

	public static void main(String[] args) {
		System.out.println(CustomerManager.customers);
		
		Customer c1 = new Customer(1, "Ahmet", "EG�N");
		Customer c2 = new Customer(2, "Ka�an", "KURT");
		Customer c3 = new Customer(3, "Taha", "EK��");
		
		CustomerManager.add(c1);
		CustomerManager.add(c2);
		System.out.println(CustomerManager.customers);
		System.out.println(c1.hashCode());
		
		
	}
}

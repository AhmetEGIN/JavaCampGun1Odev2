package StaticDers;

public class CustomerManager {
	public static int customers;
	
	public String name11;
	
	public static void add(Customer customer) {
		int id = customer.getId() + 10;
		System.out.println("M��teri eklendi" + customer.getFirstName() + customer.getLastName() +" d�zenlenmi� id: " + id);
		customers ++;
		
	}
	
	
	
}	

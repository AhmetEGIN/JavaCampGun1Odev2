package RepositoryDemo;

public class Main {

	public static void main(String[] args) {
		// Veri taban� nesneleri i�in ekleme, g�ncelleme, silme, data �ekme i�lemleri ayn�d�r. 
		// Tek fark kullan�lan alanlarr de�i�ir: Customer, Product, Order
		
		Validator validator = new Validator();
		validator.validate(new Customer());

	}

}

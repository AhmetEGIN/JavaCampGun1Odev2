package classesWithAttribute;

public class Product {

	public Product() {
		System.out.println("Yap�c� blok �al��t�");

	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	
	// getter
	public int getId() {
		return _id;
	}
	// setter
	public void setId(int id) {
		// this i�erisinde bulundu�umuz class demek
		// this.id = id;  b�yle de yaz�labilir
		_id = id;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		_description = _description;
	}
	public String getKod() {
		return this._name.substring(0,1) + _id;
	}
	
	
	
	
}

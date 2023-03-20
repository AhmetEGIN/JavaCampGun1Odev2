package functionAndPredicateDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Person {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

public class Main {

	public static void main(String[] args) {
//		Consumer : Paremetre al�p i�lem yapar ve geriye sonu� d�nd�rmez.
//		void accept(T t);
		
//		Predicate: Parametre al�r ve �arta ba�l� olarak boolean sonu� d�nd�r�r.
//		boolean test(T t);
		
//		Supplier: Hi� parametre almaz ancak T tipinde de�er d�nd�r�r.
//		T get();
		
//		Function: Parametre al�r, i�ler ve geriye bir sonu� �retir.
//		R apply(T t);
		
		Function<Integer, Integer> math = x -> x*x;
		Predicate<String> p = str -> str.equals("def");
		System.out.println(p.test("def"));
		System.out.println(math.apply(3));
		
		
		// ## CONSUMER ##
		
	    // accept() metoduna String tipte bir parametre g�ndererek �al��mas�n� sa�lad�k.
        Consumer<String> consumer = name -> System.out.println("�sminiz : " + name);
        consumer.accept("Ahmet EG�N"); // ��kt� => �sminiz : Ahmet EG�N
        
        // andThen metodu ile iki tane Consumer'� birle�tirebiliriz
        
        System.out.println("****");
        Person person = new Person("Ahmet","EG�N");

        Consumer<Person> updateName = per -> per.setFirstName(per.getFirstName().toLowerCase());
        updateName = updateName.andThen(per -> per.setLastName(per.getLastName().toUpperCase()));
        updateName.accept(person);
        System.out.println(person.getFirstName() + " " + person.getLastName());
        
        
         // ## PREDICATE ##
        
//        Predicate aray�z�, Consumer aray�z� gibi T tipinde bir girdi al�r ve 
//        kendisine sunulan �art�n sa�lan�p sa�lanmad���n� kontrol ederek geriye �true ya da false� de�er d�ner.
//        Boolean d�n�� de�erine sahip bir i�lev olarak d���n�lebilir.
//        Filtreleme ve gruplama gibi i�lemlerde kullan�l�r.
        
        System.out.println("---");
        Predicate<Integer> isAEvenNumber = number -> number %2 ==0;
        boolean result = isAEvenNumber.test(5);
        System.out.println((result ? "�ift" : "Tek"));
        
//        and(): �ki Predicate�i birle�tirir ve mant�kta ki ve (&&) i�lemine tabi tutar.
//        or(): and() ile ayn�d�r ancak bu sefer mant�kta ki or i�lemine tabi tutulur.
//        negate(): Not ile ayn� i�levi g�r�r. Sonu� neyse tersini geri d�nd�r�r.

        Predicate<String> predicate = name -> name == "Ahmet";
        predicate = predicate.and(name -> name.length() == 5);
        System.out.println(predicate.test("Ahmet"));
        Predicate<String> predicate2 = name -> name == "Ahmet";
        predicate2 = predicate2.or(name -> name.length() == 5);
        System.out.println(predicate2.test("abasd"));
        System.out.println("negate Predicate 'tan d�nen sonucun tam tersini al�r: " + predicate.negate().test("Ahmet"));
        
        // Predicate lar bir �ok metotta parametre olarak kullan�labilir.
        // Predicate lar stream.filter metodunda da kullan�l�r
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(15, "asda"));
        students.add(new Student(27, "qwe"));
        students.add(new Student(12, "rty"));
        students.add(new Student(17, "yu�"));
        students.add(new Student(23, "fgj"));
        students.add(new Student(23, "adfa"));
        students.add(new Student(24, "kimasd"));
        
        Consumer<Student> consumer2 = student -> System.out.println("isim:" + student.getName() + "/" + student.getAge()); 
        students.stream().forEach(consumer2);
        System.out.println("####");
        Predicate<Student> predicate3 = student -> student.getAge() >16;
        List<Student> filtered = students.stream().filter(predicate3).toList();
        filtered.stream().forEach(consumer2);
        
        System.out.println("*******");
		// ## SUPPL�ER ##
//        Consumer aray�z�n�n tam tersini yapar. 
//        Yani girdi olarak bir �ey almaz ancak geriye bir de�er d�nd�r�r.
        
        Supplier<String> supplier = () -> "Ho�geldiniz: ";
        System.out.println(supplier.get());
        
        
        System.out.println("**********");
        // ## FUNCT�ON ##
//        Function<T, R>
//        Function aray�z�, jenerik olarak T tipinde bir parametre al�r, verilen i�i y�r�t�r ve ard�ndan R tipinde bir de�er d�nd�r�r.
        
        Function<Integer, Double> function2 = number -> number * 3.14;
        System.out.println(function2.apply(2));
        
        // Girilen parametre ve d�n�� tipi ayn� oldu�u durumlarda UnaryOperator kullanabiliriz.
        // Unary aray�z� Function aray�z�n� kal�tmaktad�r.
        
        UnaryOperator<String> unaryOperator = string -> string.toUpperCase();
        System.out.println(unaryOperator.apply("asd"));
        
//        BiFunction<T, U, R>
        // BiFunction T ve U tiplerinde iki parametre al�r, R tipinde de�er d�nd�r�r
        // Function'dan tek fark� iki parametre alabiliyor olmas�d�r.
        BiFunction<Integer, Integer, Double> biFunction = (sayi1, sayi2) -> {
        	Integer integerValue = sayi1 + sayi2;
        	Double doubleValue = integerValue.doubleValue();
        	return doubleValue;
        };
        
        Double biFunctionResult = biFunction.apply(5, 10);
        System.out.println(biFunctionResult);
        
	}

}

class Student {
	private int age;
	private String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}

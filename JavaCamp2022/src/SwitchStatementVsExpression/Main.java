package SwitchStatementVsExpression;

public class Main {

	public static void main(String[] args) {
		
		String animal = "DOG";
		
		// break komutunu koymazsak ilgili case'den ba�lay�p sona kadar devam eder.
		
	    switch (animal) {
	    // E�er birden fazla case ayn� i�leme sahipse onlar� alt alta yazabiliriz
	    case "DOG":
	    case "CAT":
	        System.out.println("domestic animal");
	        break;
	    case "TIGER":
	        System.out.println("wild animal");
	    	break;

	    }
	    System.out.println("***");
	    
	    switch (animal) {
		case "DOG" -> System.out.println("asd");
		case "CAT" -> System.out.println("CAT");
//		default -> throw new IllegalArgumentException("Unexpected value: " + animal);
		}
	    System.out.println("***");
	    
	    // Switch expression da lambda kullan�yoruz.
	    // Switch expression da default de�er girmemiz zorunlu. 
	    // Switch statement tan farkl� olarak burada break komutu zorunlu de�il.
	    String month = "MAY";
	    int result = switch(month) {
	    case "JANUAR", "JUNE", "JULY" -> 3;
	    case "FEBRUAR", "SEPTEMBER" -> 2;
	    case "MARCH", "MAY" ->1;
	    default -> 0;
	    };
	    
	    System.out.println(result);
	    System.out.println("-------");
	    
	    String day = "WEDNESDAY";
	    
	    int numLetters = switch (day) {
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
			System.out.println(6);
			yield 6;
		case "THURSDAY":
		case "FRIDAY":
			System.out.println(8);
			yield 8;
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		};
	   
		System.out.println("-------");
		
		int numLetters2 = switch (day) {
		case "MONDAY", "TUESDAY", "WEDNESDAY" -> {
			System.out.println(6);
			yield 6;
		}
		case "THURSDAY" -> {
			System.out.println(9);
			yield 7;
		}
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + day);
		};
		
		System.out.println("---------");
		
		int apple = 12;
		int number = 10;
		switch (number) {
		
		// A�a��daki case �al��maz ��nk� apple constant bir say� de�il
//		case apple:
//			System.out.println("asd�");
			
//			break;

		default:
			break;
		}
		
		
		
	}

}

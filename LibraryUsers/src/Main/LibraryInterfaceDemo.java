package Main;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		AdultUsers adult1 = new AdultUsers(29, "Fiction");
		AdultUsers adult2 = new AdultUsers(39, "Kids");
		
		KidUsers kid1 = new KidUsers(9, "Fiction");
		KidUsers kid2 = new KidUsers(10, "Kids");
		
		kid1.registerAccount("Jim", 10);
		kid2.registerAccount("Doug", 9);
		
		adult1.registerAccount("Bob", 29);
		adult2.registerAccount("Mark", 39);
		
		kid1.requestBook("Kids", 9);
		adult1.requestBook("Fiction", 29);
	
	}

}

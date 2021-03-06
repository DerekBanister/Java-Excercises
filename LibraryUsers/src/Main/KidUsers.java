package Main;

public class KidUsers implements LibraryUser {
		
	private int age;
	private String bookType;
	
	public KidUsers() {
		
	}
	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}
	
	

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount(String name, int age) {
		// TODO Auto-generated method stub
		if(age < 12) {
			System.out.println("You have successfully registered"
					+ " under a Kids Account");
		} else {
			System.out.println("Sorry, Age must be less than "
					+ "12 to register as a Kid");
		}
	}
	
	@Override
	public void requestBook(String bookType, int checkoutTime) {
		if(bookType == "Kids") {
			System.out.println("Book issued successfully, "
					+ "please return the book within 10 days");
		} else {
			System.out.println("Oops, you are only allowed to take Kids books!");
		}
		
	}
	
	@Override
	public String toString() {
		return "KidUsers [age=" + age + ", bookType=" + bookType + "]";
	}
	

}

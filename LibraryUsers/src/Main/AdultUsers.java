package Main;

public class AdultUsers implements LibraryUser {

	private int age;
	private String bookType;
	
	public AdultUsers() {
		
	}
	
	public AdultUsers(int age, String bookType) {
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
		if(age > 12) {
			System.out.println("You have successfully registered"
					+ " under a Adult Account");
		} else {
			System.out.println("Sorry, Age must be less than "
					+ "12 to register as a Adult");
		}
		
	}

	@Override
	public void requestBook(String bookType, int checkoutTime) {
		if(bookType == "Fiction") {
			System.out.println("Book issued successfully, "
					+ "please return the book within 7 days");
		} else {
			System.out.println("Oops, you are only allowed to take Adult books!");
		}
		
	}
	@Override
	public String toString() {
		return "AdultUsers [age=" + age + ", bookType=" + bookType + "]";
	}

}

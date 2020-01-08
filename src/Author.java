import java.io.Serializable;
import java.util.*;

public class Author implements Serializable{

	static final long serialVersionUID = 42L;
	
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public static Author readFromKeyboard(Scanner input) {
		String name;
		String email;
		char gender;
		
		System.out.println("Enter your name of the Author: ");
		name = input.nextLine();
		System.out.println("Enter your email: ");
		email = input.nextLine();
		System.out.println("Enter your gender: ");
		gender = input.nextLine().charAt(0);
		
		Author a = new Author(name, email, gender);
		return a;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return name + " (" + gender + ") at " + email; 
	}
	
}

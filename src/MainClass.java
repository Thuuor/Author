import java.io.*;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Book b = Book.readFromKeyboard(input);
		System.out.println(b);
		
		input.close();
	}

}

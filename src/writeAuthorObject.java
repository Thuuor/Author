import java.io.*;
import java.util.*;

public class writeAuthorObject {

	static final String dataFile = "dataAuthors";
	
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(
					new DataOutputStream(
							new BufferedOutputStream(
									new FileOutputStream(dataFile))));

			Author a = Author.readFromKeyboard(scan);
			Author b = Author.readFromKeyboard(scan);
			
			out.writeObject(a);
			out.writeObject(b);
			
		}finally {
			if (out != null) {
				out.close();
			}
		}
		
	}
	
}

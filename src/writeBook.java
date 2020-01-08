import java.io.*;
import java.util.*;

public class writeBook {

	static final String dataFile = "dataBooks";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(
						new DataOutputStream(
								new BufferedOutputStream(
										new FileOutputStream(dataFile))));

			Book b = Book.readFromKeyboard(scan);

			out.writeObject(b);


		} finally {
			if (out != null) {
				out.close();
			}
		}

	}
}

import java.io.*;
import java.util.*;

public class writeAuthor {

	static final String dataFile = "dataAuthors";
	
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(dataFile)));

			Author a = Author.readFromKeyboard(scan);
			Author b = Author.readFromKeyboard(scan);
			
			writeAuthorToFile(a,out);
			writeAuthorToFile(b,out);
			
		}finally {
			if (out != null) {
				out.close();
			}
		}
		
	}

	private static void writeAuthorToFile(Author a, DataOutputStream out) throws IOException {

		out.writeUTF(a.getName());
		out.writeUTF(a.getEmail());
		out.writeChar(a.getGender());
		
	}

}

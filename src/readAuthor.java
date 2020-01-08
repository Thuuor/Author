import java.io.*;

public class readAuthor {
	
	public static void main(String[] args) throws IOException {

		readFile();
	}
	
	public static void readFile() throws IOException {
		DataInputStream input = null;
		try {
			input = new DataInputStream(
						new BufferedInputStream(
								new FileInputStream(writeAuthor.dataFile)));
			
			try {
				while (true) {
					String name = input.readUTF();
					String gmail = input.readUTF();
					char gender = input.readChar();
					Author author = new Author(name,gmail,gender);
					System.out.print(author);
				} 
			} catch(EOFException ex) {
				
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
}

import java.io.*;

public class readBook {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		readFile();
	}
	
	public static void readFile() throws IOException, ClassNotFoundException {
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(
						new DataInputStream(
								new BufferedInputStream(
										new FileInputStream(writeBook.dataFile))));
			
			try {
				while (true) {					
					Book obj = (Book)input.readObject();
					System.out.println(obj);
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

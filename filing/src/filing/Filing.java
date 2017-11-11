package filing;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Filing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:/Users/newlife network/workspace/loanManagement/hani.txt");
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

			

			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}

		} catch (IOException e) {
			System.out.println("Error");
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				System.out.println("Error");
			}
		}
	
	
	}
	}

	



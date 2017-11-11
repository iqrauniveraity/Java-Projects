import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class fiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "e";
		String s3 = "f";
		String s4 = "g";
		String s5 = "h";
		String s6 = "i";
		String s7 = "j";
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\University.txt"));
			bw.write(s1);
			bw.write(s2);
			bw.write(s3);
			bw.write(s4);
			bw.write(s5);
			bw.write(s6);
			bw.write(s7);
			
			bw.close();
		}
		catch(Exception e){
			System.out.println("Error loading file");
		}
		try{
		BufferedReader br = new BufferedReader(new FileReader("E:\\University.txt"));
		System.out.println(br.readLine());
		}
		catch(Exception e){
			System.out.println("Error in opening");
		}
	}

}

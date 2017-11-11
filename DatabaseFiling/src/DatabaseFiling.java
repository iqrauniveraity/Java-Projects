import java.io.BufferedReader;
import java.io.LineNumberReader;
import java.io.FileReader;
public class DatabaseFiling {
	static String filePath = "E:\\Student.csv"; 
	static String separator = ",";
	 
	
	public String[][] getRecords()
	{  
		try
		{ 
			int totalRecords = 0;
			String record = "";
			int index = 0;
			
			FileReader dataFile = new FileReader(filePath); 
		    BufferedReader br = new BufferedReader(dataFile);  
		    
	    	totalRecords = numberOfRecords();
	    	String[][] Data = new String[ totalRecords][]; 
		        
		        while ((record = br.readLine()) != null)
		        {
		            // use comma as separator
		        	if(index != 0)
		            {
		        		String[] dataStudent = record.split(separator);
		        		Data[index-1] = dataStudent;
		            } 
		            index++;
		        }
		        br.close();
		        System.out.println(Data[0][0]);
		        return Data;  
		    }	    
		    catch (Exception e)
		    {
		    	System.out.println(e.toString());
		    	 return null;
		    } 
	}
	
	public String[] getHeaders()
	{
		try {
			String[] Header = new String[numberOfColumns()];
			FileReader dataFile = new FileReader(filePath);
			BufferedReader br = new BufferedReader(dataFile);
			Header = br.readLine().split(separator);
			br.close();
			return Header;
		}
		catch (Exception e) {
			System.out.println(e.toString());
			return null;
		} 
	}
	
	static int numberOfRecords()
	{
		try{
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		return lines-1;
		}
		catch (Exception e)
		{
			return 0;
		}
		
	}
	static int numberOfColumns( )
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			int columns  =  reader.readLine().split(separator).length;
			reader.close();
			return columns; 
		}
		catch (Exception e)
		{
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 DatabaseFiling obj = new DatabaseFiling();
	}

}

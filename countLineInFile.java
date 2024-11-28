package sam1_L1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class countLineInFile {
	public static void main(String[] args) {
       String filePath = "C:\\Users\\LENOVO\\Documents\\Ultramail company questions.txt";  // Replace with your file path
	   int lineCount = 0;
	   
	   try{
		   FileReader fileReader = new FileReader(filePath);
	        BufferedReader br = new BufferedReader(fileReader);

	        while (br.readLine() != null) {
	            lineCount++;
	        }

	        br.close();
	        fileReader.close();
	   }
	   
	   catch (IOException e) {
	      e.printStackTrace();
	   }
	   
	   System.out.println("Number of lines in the file: " + lineCount);
	}
}

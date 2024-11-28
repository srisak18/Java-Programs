package sam1_L1;
import java.util.Scanner;

public class WordsMoreThan5Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();  
        scanner.close();

	    String[] str = input.split("\\s+");
	    for(String s : str) {
	    	if(s.length() > 5) {
	    		System.out.println(s);
	    	}
	    }
	    
    }
}

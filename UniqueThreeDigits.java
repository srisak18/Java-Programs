package sam1_L1;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class UniqueThreeDigits{
    public static void main(String[] args) {
    	
    	//Getting n value to print n number of codes.
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter n value: ");
    	int n = scan.nextInt();
    	scan.close();
    	
    	//Random class is used here to generate random values.
        Random random = new Random();
        
        //Set confirms the uniqueness of the words.
        Set<Integer> uniqueCodes = new HashSet<>();
        while (uniqueCodes.size() < n) {  
            int code = random.nextInt(900) + 100; 
            uniqueCodes.add(code);
        }
        
        //print the unique 3 digit codes in the hashset.
        for(int x : uniqueCodes) {
        	System.out.print(x + " ");
        }
    }
}
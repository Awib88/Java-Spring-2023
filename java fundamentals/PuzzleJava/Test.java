import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Test {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	        //..
		// Write your other test cases here.
		//..

        // get Random letter test
        System.out.println("------------------------------Random letter test------------------------------");
        char randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);
        
        // generate random password
        System.out.println("------------------------------Random pw test------------------------------");
        String securepassword = generator.generatePassword();
        System.out.println(securepassword);

        //generate password set array
        System.out.println("------------------------------Password Set test------------------------------");
        String[] myPasswords = generator.getNewPasswordSet(10);
        System.out.println(Arrays.toString(myPasswords));
	}
}

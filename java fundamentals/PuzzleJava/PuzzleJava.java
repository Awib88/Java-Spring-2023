import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    Random rand = new Random();

    public ArrayList<Integer> getTenRolls(){
        
        ArrayList<Integer> arrayOfTen = new ArrayList<Integer>();

        for (int i=0; i < 10 ; i++ ){
            arrayOfTen.add(rand.nextInt(21));
        }
        return arrayOfTen;
    }

    public char getRandomLetter(){
        char[] alphabetArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        int randIndex = rand.nextInt(26);
        char randLetter = alphabetArray[randIndex];

        return randLetter;
    }

    public String generatePassword(){
        String generatedPassword = "";

        for ( int i = 0; i<8 ;i++){
            generatedPassword = generatedPassword + getRandomLetter();
        }
        return generatedPassword;
    }

    public String[] getNewPasswordSet(int length){
        String[] passwordSet;
        passwordSet = new String[length];

        for (int i = 0 ; i<length;i++){
            passwordSet[i]=generatePassword();
        }
        return passwordSet;
    }

}
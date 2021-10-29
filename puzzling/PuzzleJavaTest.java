import java.util.ArrayList;
import java.util.Random;

public class PuzzleJavaTest {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        
        // getTenRolls test
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        // getRandomLetter test
        // int num = generator.getRandomLetter();
        // System.out.println(num);
        char randomChar = generator.getRandomLetter();
        System.out.println(randomChar);

        // generatePassword test
        String randomPassword = generator.generatePassword();
        System.out.println(randomPassword);
        // ...
        // Write your other test cases here
        // ...
    }
}
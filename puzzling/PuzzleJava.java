import java.util.ArrayList;
// You will need to import the Random library from java.util
import java.util.Random;

// From here, any of the methods listed in the documentation for Random can be used.
// example: randomMachine.setSeed(35679);

public class PuzzleJava {
// To use methods from the Random library you will need to create an instance of Random
    Random randomMachine = new Random();

// getTenRolls - write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRollList = new ArrayList<Integer>();
        for (int i=0; i < 10; i++) {
            int num = randomMachine.nextInt(6)+1;
            tenRollList.add(num);
        }
        return tenRollList;
    }

// getRandomLetter - Write a method that will:
    public char getRandomLetter() {
// 1) Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
        char[] alphabetCharArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        // return alphabetCharArray.length
// 2) Generate a random index between 0-25, and use it to pull a random letter out of the array.
        int randomNum = randomMachine.nextInt(26);
// 3) Return the random letter.
        return alphabetCharArray[randomNum];
    }

// generatePassword
// Write a method that uses the previous method to create a random string of eight characters, and return that string.
    public String generatePassword() {
        char[] alphabetCharArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String newRandomPassword ="";
        int charOfPassword = 8;
        for (int i=0; i < charOfPassword; i++) {
            int randomNum = randomMachine.nextInt(26);
            newRandomPassword+=alphabetCharArray[randomNum];
        }
        return newRandomPassword;
    }
// SENSEI BONUS SECTION
// shuffleArray
// Write a method that takes an array and and mixes up all the values in a pseudo-random way. Hint: use random indexes within the array, and swap values repeatedly. 

}
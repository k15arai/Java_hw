import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args) {
        
        // Make an instance of BasicJava to access all the methods to test
        BasicJava basicJavaBot = new BasicJava();

        // Run some tests of the methods, providing necessary data
        
        // print numbers from 1 to 255
        basicJavaBot.printTo255();

        // print odd numbers from 1 to 255
        basicJavaBot.printOddNumsTo255();

        // Sum of numbers to 255
        int sumTo255 = basicJavaBot.returnSumOfNumsTo255();
        System.out.println(sumTo255);

        // iterate through an array
        basicJavaBot.iterateThroughArray();

        // find max number of an array that is passed into a function
        int[] myArray_max = {-51, -2, 250, 74, 10, 150};
        int maxfromArray = basicJavaBot.findMax(myArray_max);
        System.out.println(maxfromArray);

        // create array with odd numbers between 1 to 255
        ArrayList<Integer> myArray_odd = new ArrayList<Integer>();
        myArray_odd = basicJavaBot.arrayWithOddNumbers(255); // can change the parameter to change array output
        System.out.println(myArray_odd);

        // NINJA BONUS

        // get average
        int[] arrayForAverage = {-1,2,-3,4,-5,6,7,20};
        float average = basicJavaBot.getAverage(arrayForAverage);
        System.out.println("Average is: "+ average);

        // greater than Y
        int[] arrayToCheck = {2,4,5,6,7,9,10,11,12};
        int Y = 8;
        int numsGreaterThanY = basicJavaBot.greaterThanY(arrayToCheck, Y);
        System.out.println("Numbers in array greater than Y: " + numsGreaterThanY);

        // square values
        int[] initialArray = {-1,2,3,4,5,6,7,8};
        ArrayList<Integer> myArraySquared = new ArrayList<Integer>();
        myArraySquared = basicJavaBot.squareArray(initialArray);
        System.out.println("My initial array squared: " + myArraySquared);

        // Eliminate Negative Values
        int[] initialArrayCheckNegatives = {-1,2,-3,4,5,-6,7,8};
        ArrayList<Integer> myArrayNoNegatives = new ArrayList<Integer>();
        myArrayNoNegatives = basicJavaBot.noNegativeArray(initialArrayCheckNegatives);
        System.out.println("Array with no negatives: " + myArrayNoNegatives);

        // Sensei Bonuses

        // Max, Min, and Average
        int [] initialArrayMaxMinAverage = {1,2,3,4,5,6,7,8,9,10};
        int [] maxMinAverage = new int[3];
        maxMinAverage = basicJavaBot.maxMinAverage(initialArrayMaxMinAverage);
        System.out.println(Arrays.toString(maxMinAverage));
        System.out.println("Max Number: " + maxMinAverage[0] + " / " + "Min Number: " + maxMinAverage[1] + " / " + "Average: " + maxMinAverage[2]);

        // Shifting the Values in the Array
        int [] initialArrayToShift = {1,2,3,4,5,6,7,8,9};
        int [] shiftedArray = basicJavaBot.shiftArray(initialArrayToShift);
        
    }
}
import java.util.ArrayList;

public class BasicJava {
    // print 1-255
    public void printTo255() {
        int i = 1;
        while (i < 256) {
            System.out.println(i);
            i++;
        }
    }

    // print odd numbers between 1-255
    public void printOddNumsTo255() {
        int i = 1;
        while (i < 256) {
            if (i%2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    // sigma of 255. aka sum to 255

    public int returnSumOfNumsTo255() {
        int i = 1;
        int sum = 0;
        while (i < 256) {
            sum += i;
            i++;
        }
        return sum;
    }

    // iterating through an array
    public void iterateThroughArray() {
        int[] practiceArray = {1,3,5,7,9,13};
        for (int i=0; i < practiceArray.length; i++) {
            System.out.println(practiceArray[i]);
        }
    }

    // find max
    public int findMax(int [] array) {
        int max = array[0];
        for (int i=1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    // array with odd numbers
    public ArrayList<Integer> arrayWithOddNumbers(int topNumber) {
        ArrayList<Integer> oddNumList = new ArrayList<Integer>();
        for (int i=0; i < topNumber; i++) {
            if (i%2 == 1) {
                oddNumList.add(i);
            }
        }
        return oddNumList;
    }

    // NINJA BONUS SECTION

    // get average
    public float getAverage(int[] array) {
        float sum = 0;
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println(array.length);
        return (sum / array.length);
    }

    // greater than Y
    public int greaterThanY(int[] array, int yNumber) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] > yNumber) {
                count++;
            }
        }
        return count;
    }

    // square the values
    public ArrayList<Integer> squareArray(int[] array) {
        ArrayList<Integer> squaredList = new ArrayList<Integer>();
        for (int i=0; i < array.length; i++) {
            int squared = array[i] * array[i];
            squaredList.add(squared);
        }
        return squaredList;
    }

    // eliminate negative values
    public ArrayList<Integer> noNegativeArray(int[] array) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i=0; i < array.length; i++) {
            if (array[i] < 0) {
                newList.add(0);
            } else {
                newList.add(i);
            }
        }
        return newList;
    }

    // SENSEI BONUS SECTION

    // Max, Min, and Average
    public int[] maxMinAverage(int[] arrayToBeReviewed) {
        int sum = 0;
        int average;
        int min = arrayToBeReviewed[0];
        int max = arrayToBeReviewed[0];
        int [] maxMinAverage = new int[3];
        for (int i=1; i < arrayToBeReviewed.length; i++) {
            sum += arrayToBeReviewed[i];
            if (arrayToBeReviewed[i] < min) {
                min = arrayToBeReviewed[i];
            }
            if (arrayToBeReviewed[i] > max) {
                max = arrayToBeReviewed[i];
            }
        }
        average = (sum / arrayToBeReviewed.length);
        maxMinAverage[0] = max;
        maxMinAverage[1] = min;
        maxMinAverage[2] = average;

        return maxMinAverage;
    }

    // Shifting the values in the Array
    public int[] shiftArray(int[] arrayToBeShifted) {
        for (int i=0; i < arrayToBeShifted.length; i++) {
            if (i < arrayToBeShifted.length-1) {
                arrayToBeShifted[i] = arrayToBeShifted[i+1];
            } else {
                arrayToBeShifted[i] = 0;
            }    
        }
        return arrayToBeShifted;
    }
}
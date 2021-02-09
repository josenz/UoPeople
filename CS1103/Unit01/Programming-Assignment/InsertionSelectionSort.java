import java.util.*;

// 1000 items arrray:

    // The Insertion Sort approach for 1000 items-array takes 3 miliseconds.
    // The Insertion Sort approach for 1000 items-array takes 0.003 seconds.

    // The Selection Sort approach for 1000 items-array takes 5 miliseconds
    // The Selection Sort approach for 1000 items-array takes 0.005 seconds

    // Using the Arrays.sort method to sort 1000 items-array takes 1 miliseconds
    // Using the Arrays.sort method to sort 1000 items-array takes 0.001 seconds


// 10000 itesms array:

    // The Insertion Sort approach for 10000 items-array takes 40 miliseconds.
    // The Insertion Sort approach for 10000 items-array takes 0.04 seconds.

    // The Selection Sort approach for 10000 items-array takes 52 miliseconds
    // The Selection Sort approach for 10000 items-array takes 0.052 seconds

    // Using the Arrays.sort method to sort 10000 items-array takes 4 miliseconds
    // Using the Arrays.sort method to sort 10000 items-array takes 0.004 seconds


// 100000 items array:

    // he Insertion Sort approach for 100000 items-array takes 3912 miliseconds.
    // The Insertion Sort approach for 100000 items-array takes 3.912 seconds.

    // The Selection Sort approach for 100000 items-array takes 3885 miliseconds
    // The Selection Sort approach for 100000 items-array takes 3.885 seconds

    // Using the Arrays.sort method to sort 100000 items-array takes 5 miliseconds
    // Using the Arrays.sort method to sort 100000 items-array takes 0.005 seconds



/**
 * This small program calculates how many miliseconds and seconds the using of
 * the Insertion Sort, Selection Sort, and Arrays.sort() take to sort arrays
 * with different sizes. myArrayConstant is a constant to be modified
 * accordingly with the units of items each array should have.
 */
public class InsertionSelectionSort {

    public static void main(String[] args) {

        int myArrayConstant = 100000;
        int[] myArray = new int[myArrayConstant];

        for (int i = 0; i < myArrayConstant; i++) {
            myArray[i] = (int) (Integer.MAX_VALUE * Math.random());
        }
        
        // System.out.print(Arrays.toString(myArray));

        insertionSort(myArray, myArrayConstant);
        selectionSort(myArray, myArrayConstant);

        useArraySort(myArray, myArrayConstant);
        
    }

    static void insertionSort(int[] A, int arrayItems) {

        int itemsSorted;
        
        long startTime = System.currentTimeMillis();

        for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
            
            int temp = A[itemsSorted];

            int loc = itemsSorted - 1;

            while (loc >= 0 && A[loc] > temp) {
                A[loc + 1] = A[loc];
                loc = loc - 1;
            }
            A[loc + 1] = temp;
        }

        long runTime = System.currentTimeMillis() - startTime;

        System.out.println("");
        System.out.println("The Insertion Sort approach for " + arrayItems + " items-array takes " + runTime + " miliseconds.");
        System.out.println("The Insertion Sort approach for " + arrayItems + " items-array takes " + runTime/1000.0  + " seconds.");
    }

    static void selectionSort(int[] A, int arrayItems) {

        long startTime = System.currentTimeMillis();

        for (int lastPlace = A.length - 1; lastPlace > 0; lastPlace--) {
            int maxLoc = 0;

            for (int j =1; j <= lastPlace; j++) {
                if (A[j] > A[maxLoc]) {
                    maxLoc = j;
                }
            }
            
            int temp = A[maxLoc];
            A[maxLoc] = A[lastPlace];
            A[lastPlace] = temp;
        }

        long runTime = System.currentTimeMillis() - startTime;

        System.out.println("");
        System.out.println("The Selection Sort approach for " + arrayItems + " items-array takes " + runTime + " miliseconds");
        System.out.println("The Selection Sort approach for " + arrayItems + " items-array takes " + runTime/1000.0 + " seconds");
    }

    static void useArraySort(int[] A, int arrayItems) {
        
        long startTime = System.currentTimeMillis();
        Arrays.sort(A);
        long runTime = System.currentTimeMillis() - startTime;

        System.out.println("");
        System.out.println("Using the Arrays.sort method to sort " + arrayItems + " items-array takes " + runTime + " miliseconds");
        System.out.println("Using the Arrays.sort method to sort " + arrayItems + " items-array takes " + runTime/1000.0 + " seconds");

    }
    
}
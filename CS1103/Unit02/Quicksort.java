import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {

        int[] A = { 70, 40, 90, 30, 10, 50, 60, 0, 80, 20, 100 };
        int lo = 0;

        quicksort(A, lo, A.length - 1);
    }

    /**
     * Apply quicksort to put the array elements between position 'lo' and position
     * 'hi' into increasing order.
     */
    static void quicksort(int[] A, int lo, int hi) {

        if (hi <= lo) {
            return;
        } else {
            int pivotPosition = quicksortStep(A, lo, hi);
            quicksort(A, lo, pivotPosition - 1);
            quicksort(A, pivotPosition + 1, hi);
        }
    }

    /**
     * Apply QuicksortStep to the list of items in locations 'lo' through 'hi' in
     * the array A. The value returned by this routine is the final position of the
     * pivot item in the array.
     */
    static int quicksortStep(int[] A, int lo, int hi) {

        int pivot = A[lo]; 

        while (hi > lo) {

            while (hi > lo && A[hi] >= pivot) {
                hi--;
            }

            if (hi == lo) {
                System.out.println(Arrays.toString(A));
                break;
            }

            A[lo] = A[hi];
            lo++;

            while (hi > lo && A[lo] <= pivot) {
                lo++;
            }

            if (hi == lo) {
                System.out.println(Arrays.toString(A));
                break;
            }

            A[hi] = A[lo];
            hi--;
        } 

        A[lo] = pivot;
        return lo;
    } 
}
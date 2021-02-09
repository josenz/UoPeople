/**
 * Search in the array A in positions numbered loIndex to hiIndex,
 * inclusive, for the specified value. If the value is found, return
 * the index in the array where it occurs. If the value is not found.
 * return -1. Precondition: The array must be sorted into increasing
 * order.
 */

 public class BinarySearch {
     
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(A.length);
        int loIndex = 0;
        int hiIndex = 10;
        int value = 6;
        System.out.println(searchBinary(A, loIndex, hiIndex, value));
        System.out.println(searchBinary(A, 0, A.length - 1, value));
    }

    static int searchBinary(int[] A, int loIndex, int hiIndex, int value) {

        if (loIndex > hiIndex) {
            // The starting position comes after the final index,
            // so there are actually no elements in the specified
            // range. The value does not occur in this empty list!
            return -1;
        }
        else {
            // Look at the middle position in the list. If the 
            //  value occurs at the position, return that position.
            //  Otherwise, search recursively in either the first half
            //  or the second half of the list.
            int middle = (loIndex + hiIndex) / 2;
            if (value == A[middle])
                return middle;
            else if (value < A[middle])
                return searchBinary(A, loIndex, middle -1, value);
            else  // value must be > A[middle]
                return searchBinary(A, middle + 1, hiIndex, value);
        }
    } // end searchBinary
 }

 
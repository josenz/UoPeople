import java.util.*;

class ArrayGames {
    public static void main(String[] args) {
        int[][] a = { { 5, 4, 3, 2, 1 }, { -1, -2, -3, -4, -5 } };
        
        System.out.println(a[0][0]); // 5
        System.out.println(a[0][1]); // 4
        System.out.println(a[0][2]); // 3
        System.out.println(a[0][3]); // 2
        System.out.println(a[0][4]); // 1

        System.out.println(a[1][0]); // -1
        System.out.println(a[1][1]); // -2
        System.out.println(a[1][2]); // -3
        System.out.println(a[1][3]); // -4
        System.out.println(a[1][4]); // -5

        for (int[] b : a) { 
            Arrays.sort(b);
            System.out.print(Arrays.toString(b));
        }
        // [5, 4, 3, 2, 1][-1, -2, -3, -4, -5]
        
        // System.out.print(Arrays.toString(b));
        // [1, 2, 3, 4, 5][-5, -4, -3, -2, -1]
        // for (int[] b : a)
            // System.out.print(Arrays.toString(b));
            // Output -> [1, 2, 3, 4, 5][-5, -4, -3, -2, -1]
    }
}
import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {
         
        ArrayList<Integer> integerList;
        integerList = new ArrayList<Integer>();

        integerList.add( Integer.valueOf(42) );

        // autoboxing:
        integerList.add( 18 );

        // unboxing:
        int num = integerList.get(1);
        // The value returned by integerList.get(3) is of type 'Integer' but
        //   because of "unboxing" the compiler will automatically convert the 
        //   return value into an "int", as if we had said:
        int number = integerList.get(1).intValue();


        System.out.print(num);

    }
}
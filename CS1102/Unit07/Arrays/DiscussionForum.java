import java.util.ArrayList;

public class DiscussionForum {

    public static void main(String[] args) {

        ArrayList<Double> priceList;
        priceList = new ArrayList<Double>();

        // autoboxing: Allocating the value in the heap as an object.
        priceList.add(25.50);
        priceList.add(35.00);
        priceList.add(12.75);

        // unboxing: Converting the object and allocating it in the stack.
        double productPrice = priceList.get(1);

        System.out.println(productPrice);

        // Output-> 35.0

    }
}
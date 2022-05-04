
//import java.util.ArrayList;
import java.util.*;

public class algoSort {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<>(); // creating array list
        // add element
        no.add(5);
        no.add(8);
        no.add(0);
        System.out.println("Unsorted Arraylist: " + no);
        // using short method
        Collections.sort(no);
        System.out.println("Sorted arraylist:" + no);
    }
}

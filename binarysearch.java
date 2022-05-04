
import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<>();
        no.add(1);
        no.add(2);
        no.add(3);
        System.out.println("ARRAY LIST= " + no);

        // useing binary search
        int o = Collections.binarySearch(no, 3);
        System.out.println("THE position  OF 3 IS " + o);
    }
}

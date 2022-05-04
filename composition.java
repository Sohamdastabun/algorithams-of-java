
import java.util.*;

public class composition {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<>();
        no.add(8);
        no.add(9);
        no.add(2);
        no.add(6);
        System.out.println("ARRAYLIST: " + no);
        // useing frequency
        int c = Collections.frequency(no, 2);
        System.out.println("count of 2 =" + c);

        ArrayList<Integer> newno = new ArrayList<>();
        newno.add(5);
        newno.add(3);
        System.out.println("Arraylist 2 " + newno);

        // useing disjoin
        boolean dis = Collections.disjoint(newno, no);
        System.out.println("ARRAY OF DISJOIN " + dis);
    }
}

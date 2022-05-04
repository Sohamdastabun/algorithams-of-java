
import java.util.*;

public class DataMahipulation {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<>(); // creating array
        // add array
        no.add(7);
        no.add(9);
        no.add(6);
        System.out.println("ArrayList1 = " + no);
        // useing Reverse
        Collections.reverse(no);
        System.out.println(" ARRAY LIST REVERSE = " + no);

        // useing swap()
        Collections.swap(no, 0, 1);
        System.out.println("Array List of swap " + no);

        ArrayList<Integer> newno = new ArrayList<>();

        // useing addAll()
        newno.addAll(no);
        System.out.println("ArrayList 2 using addAll: " + newno);

        // Ueing fill()
        Collections.fill(no, 0);
        System.out.println("Arraylist 1 useing fill()" + no);

        // Useing Copy()
        Collections.copy(newno, no);
        System.out.println("ArrayList2 Using Copy() " + newno);

    }
}

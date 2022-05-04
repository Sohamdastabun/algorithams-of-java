
import java.util.*;

public class algoShuffle {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<>();// declared array
        // add array
        no.add(9);
        no.add(8);
        no.add(10);
        System.out.println("Sorted ArrayList" + no);
        // useing suffering
        Collections.shuffle(no);
        System.out.println("Arraylist useing shuffle :" + no);

    }
}

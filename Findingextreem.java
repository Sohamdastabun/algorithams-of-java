
import java.util.*;

public class Findingextreem {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<>();
        no.add(6);
        no.add(8);
        no.add(4);
        System.out.println("ARRAY LIST " + no);

        // useing min()
        int min = Collections.min(no);
        System.out.println("Minimum Element : " + min);

        // useing max()
        int max = Collections.max(no);
        System.out.println("MAximum Element : " + max);
    }
}

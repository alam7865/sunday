import java.util.*;

public class test {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}

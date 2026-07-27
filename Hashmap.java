import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        Map<Integer, Integer> m = new HashMap<>();

        for (int temp : arr) {
            if (m.containsKey(temp)) {
                int increment = m.get(temp) + 1;
                m.put(temp, increment);
            } else {
                m.put(temp, 1);
            }
        }

        System.out.println(m);
    }
}
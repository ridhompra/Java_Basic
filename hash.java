import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        int[] data1 = {1, 1, 1, 2, 2, 4, 1, 1};
        int[] data2 = {2, 1, 2, 2, 2, 8, 1, 1};
        int[] data3 = {3, 3, 3, 3, 2, 4, 1, 1};

        System.out.println(Arrays.toString(data1));
        most(data1);

        System.out.println(Arrays.toString(data2));
        most(data2);

        System.out.println(Arrays.toString(data3));
        most(data3);

    }
    public static void most(int[] data) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            int num = data[i];
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        int mostFrequent = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > maxCount) {
                mostFrequent = key;
                maxCount = value;
            }
        }
        System.out.println("Total data paling banyak keluar adalah " + mostFrequent + " dengan jumlah " + maxCount);
    }
}

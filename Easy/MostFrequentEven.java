package Easy;

import java.util.*;

public class MostFrequentEven {
    public int mostFrequentEven(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i : nums) {
            if (i % 2 == 0) {
                list1.add(i);
            }
        }

        if (list1.size() == 0) {
            return -1;
        }

        for (int i : list1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                list2.add(entry.getKey());
            }
        }

        if (list2.size() > 1) {
            return Collections.min(list2);
        }

        return list2.get(0);
    }
}

package Easy;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int i : nums2) {
            if (map.getOrDefault(i, 0) > 0) {
                result.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

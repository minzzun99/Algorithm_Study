package ch10_set;

import java.util.HashSet;
import java.util.Set;

public class Problem31 {
    public static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int n = nums.length;
        int k = n/2;

        return Math.min(k, set.size());
    }
}

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findErrorNums(int[] nums) {
        // 1. Initialize a Hash Map
        // Key: the number, Value: its frequency
        Map<Integer, Integer> map = new HashMap<>();

        // 2. First Pass: Count Frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 3. Initialize Result Variables
        int duplicate = -1;
        int missing = -1;
        int n = nums.length;

        // 4. Second Pass: Find Mismatch
        // We check every number from 1 to n
        for (int i = 1; i <= n; i++) {
            int count = map.getOrDefault(i, 0);

            if (count == 2) {
                // This number appeared twice
                duplicate = i;
            } else if (count == 0) {
                // This number never appeared
                missing = i;
            }
        }

        // 5. Return Result
        return new int[] { duplicate, missing };
    }
}
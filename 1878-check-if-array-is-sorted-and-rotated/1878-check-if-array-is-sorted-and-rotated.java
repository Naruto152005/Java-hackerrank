class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // If any element is greater than the next one, it's a rotation point
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // More than one rotation point → cannot be sorted+rotated
            if (count > 1) return false;
        }
        return true;
    }
    }

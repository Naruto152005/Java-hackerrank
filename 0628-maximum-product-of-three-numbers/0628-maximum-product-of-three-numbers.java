class Solution {
    public int maximumProduct(int[] nums) {
        // We need the 3 largest and 2 smallest numbers
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Traverse the array once
        for (int num : nums) {
            // Update max values
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update min values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Case 1: product of three largest numbers
        int option1 = max1 * max2 * max3;

        // Case 2: product of two smallest numbers and the largest number
        int option2 = min1 * min2 * max1;

        return Math.max(option1, option2);
    }
}

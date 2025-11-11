class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int x = nums.length - 1;
        
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (rightSquare >= leftSquare) {
                ans[x] = rightSquare;
                right--;
                x--;
            } else {
                ans[x] = leftSquare;
                left++;
                x--;
            }
        }
        
        return ans;
    }
}
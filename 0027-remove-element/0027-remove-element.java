class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int count=0;
        int j=0;
        //int []arr=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val) {
                nums[j] = nums[i];
                j++;
                count++;
            }

        }
        return count;
    }
}
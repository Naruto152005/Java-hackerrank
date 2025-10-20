class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int temp=nums[i];
            if(nums[i+1]!=temp)
            {
                nums[j++]=nums[i];
                count++;
            }
        }
        nums[j]=nums[nums.length-1];
        count++;
        return count;
    }
}
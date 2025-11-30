class Solution {
    public void sortColors(int[] nums) {
        int s=0;
        int mid=0;
        int e=nums.length-1;
        
        while(mid<=e)
        {
            if(nums[mid]==0)
            {
                int temp=nums[s];
                nums[s++]=nums[mid];
                nums[mid++]=temp;
            }
            else if(nums[mid]==1)
            mid++;
            else
            {
                int temp=nums[mid];
                nums[mid]=nums[e];
                nums[e--]=temp;
            }
        }
    }
}
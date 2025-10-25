class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            nums[count++]=nums[i];
        }// when this loops terminated the count value is the value of where all the element is shifted to beginning and at the end we can add 0

        while(count<nums.length)
            nums[count++]=0;

    }
}
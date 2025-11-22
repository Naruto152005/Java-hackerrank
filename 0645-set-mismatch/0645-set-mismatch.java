class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1;
        int miss=-1;
        for(int num:nums)
        {
            int index=Math.abs(num)-1;
            
            if(nums[index]<0)
                dup=Math.abs(num);
            else 
                nums[index]*=-1;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            miss=i+1;
        }

        return new int[]{dup,miss};
    }
}
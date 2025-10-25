class Solution {
    public int removeDuplicates(int[] nums) {
        // int j=0;
        // int count=0;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     int temp=nums[i];
        //     if(nums[i+1]!=temp)
        //     {
        //         nums[j++]=nums[i];
        //         count++;
        //     }
        // }
        // nums[j]=nums[nums.length-1];
        // count++;
        // return count;
        // this is my code but manual coding for last element;

        //-------------------------------------------------------
        // And this is from others solution
        if (nums.length == 0) return 0;

    // int i = 0;
    // for (int j = 1; j < nums.length; j++) {
    //     if (nums[j] != nums[i]) {
    //         i++;
    //         nums[i] = nums[j];
    //     }
    // }
    // return i + 1;

// this is the logic from duplicate 2 question logic if k=2 if 2 duplicate allowed in this there is only 1 allowed means no duplicate

    int k=1;
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]!=nums[k-1])
        {
            nums[k++]=nums[i];
        }
    }
    return k;
    }
}
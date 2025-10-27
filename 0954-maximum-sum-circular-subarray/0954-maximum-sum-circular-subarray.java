class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
            int sum=0;
            int re=0;

            int min=nums[0];
            int maxkade=nums[0];
            int max=nums[0];
            int minkade=nums[0];
            for(int i=1;i<nums.length;i++)
            {
               max=Math.max(max+nums[i],nums[i]);
               maxkade=Math.max(maxkade,max);

               min=Math.min(min+nums[i],nums[i]);
               minkade=Math.min(min,minkade);
            }

            for (int i = 0; i <n; i++) {
                sum+=nums[i];
            }

            if(maxkade<0)
            return maxkade;
            re=sum-minkade;

             return Math.max(re,maxkade);
    }
}
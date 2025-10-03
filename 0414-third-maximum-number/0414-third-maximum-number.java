class Solution {
    public int thirdMax(int[] nums) {
        /*
        Integer max1=null;
        Integer max2=null;
        Integer max3=null;

        for(Integer n:nums)
        {
            if(n.equals(max1)||n.equals(max2)||n.equals(max3))
            continue;
            else if(max1==null||n>max1)
            {
                max3=max2;
                max2=max1;
                max1=n;
            }else if(max2==null||n>max2)
        {
            max3=max2;
            max2=n;
        }else if(max3==null||n>max3)
        max3=n;
            
        }

        return max3==null ? max1:max3;
    }
    */

    
    
        if (nums.length==1)
            return nums[0];
        int max = nums[0];
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int i : nums){
            if (i>max){
                max3 = max2;
                max2 = max;
                max = i;
            } else if (i<max&&i>max2) {
                max3 = max2;
                max2 = i;
            } else if (i<max2&&i>max3) {
                max3 = i;
            }
        }
        if (max3==Long.MIN_VALUE){
            return max;
        }
        return (int) max3;
}
}
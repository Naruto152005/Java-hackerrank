class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int maxlen=0;
        for(int i=0;i<n;i++)
        {
            Set<Integer>even=new HashSet<>();
            Set<Integer>odd=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                int val=nums[j];
                if(val%2==0)
                even.add(val);
                else
                odd.add(val);

                if(even.size()==odd.size())
                maxlen=Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;

    }
}
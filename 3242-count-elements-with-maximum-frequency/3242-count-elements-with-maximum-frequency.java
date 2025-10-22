class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>freq=new HashMap<>();
        int curr=0;
        int maxval=0;
        for(int i=0;i<n;i++)
        {
            curr=nums[i];
            freq.put(curr,freq.getOrDefault(curr,0)+1);
            maxval=Math.max(maxval,freq.get(curr));
           
        }

        int total=0;
        for(int val:freq.values())
        {
            if(val==maxval)
            total+=val;
        }

        return total;

    }
}
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>freq=new HashMap<>();
        int curr=0;

        for(int i=0;i<n;i++)
        {
            curr=nums[i];
            if(freq.containsKey(curr))
            freq.put(curr,freq.get(curr)+1);
            else
            freq.put(curr,1);
        }

        int maxval=0;
        for(int val:freq.values())
        {
            if(val>maxval)
            maxval=val;
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
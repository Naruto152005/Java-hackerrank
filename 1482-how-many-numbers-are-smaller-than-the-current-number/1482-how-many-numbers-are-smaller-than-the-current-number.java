class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []res=new int[nums.length];
        Map<Integer,Integer> numCount=new HashMap<>();

        int []sorted=nums.clone();
        Arrays.sort(sorted);

        for(int i=0;i<nums.length;i++)
        {
            numCount.putIfAbsent(sorted[i],i);// this will add index of that element after that is sorted like 8's index is  4 now after sorted and skips the duplicate number
        }

        for(int i=0;i<nums.length;i++)
        {
            res[i]=numCount.get(nums[i]);
            /*
            int this loop we are  storing those elments value like 
            8-->4
            1-->0
            2-->1
            2-->1
            3--->3
            */
        }
        return res;
    }
}
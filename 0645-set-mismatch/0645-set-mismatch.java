class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int duplicate=-1;
        int missing=-1;

        for(int i=0;i<=nums.length;i++)
        {
            int count=map.getOrDefault(i,0);

            if(count==2)
                duplicate=i;
            if(count==0)
            missing=i;
        }

        return new int[]{duplicate,missing};

    }
}
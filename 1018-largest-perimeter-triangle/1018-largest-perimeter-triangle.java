class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a,b,c;
        for(int i=n-1;i>=2;i--)// i>=2 for avoding array out of bound;;
        {
            c=nums[i];
            a=nums[i-1];
            b=nums[i-2];
            if((a+b)>c){
            return a+b+c;
            }
        }
        return 0;
    }
}

class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int l=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(s<=l)
        {
            int mid=s+(l-s)/2;
            if(nums[mid]>nums[l])
                s=mid+1;
            else if(nums[mid]<=nums[l]){
                ans=Math.min(ans,nums[mid]);
                l=mid-1;
            }
        }
        return ans;
    }
}
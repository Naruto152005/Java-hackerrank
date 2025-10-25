class Solution {
    public int search(int[] nums, int target) {
        int pivot=Pivot(nums);
        if(pivot==(-1))
        {
            return binaryse(nums,target,0,nums.length-1);
        }
        else if(nums[pivot]==target)
        return pivot;
        else if(nums[0]<=target){
            return binaryse(nums,target,0,pivot-1);
        }
        else
        return binaryse(nums,target,pivot+1,nums.length-1);
    }
    public int Pivot(int []arr)
    {
        int start=0;
            int end=arr.length-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(mid<end&&arr[mid]>arr[mid+1])
                    return mid;
                if(mid>start&&arr[mid]<arr[mid-1])
                    return mid-1;
                if(arr[mid]<=arr[start])
                    end=mid-1;
                else
                    start=mid+1;
            }
            return -1;
    }

    public int binaryse(int []nums,int target,int start,int end)
    {
        while(start<=end)
        {
        int mid=start+(end-start)/2;
        if(nums[mid]<target)
        start=mid+1;
        else if(nums[mid]>target)
        end=mid-1;
        else 
        return mid;
        }
        return -1;
    }
}
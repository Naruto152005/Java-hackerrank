class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a,b,c;
        for(int i=n-1;i>=2;i--)// i>=2 for avoding array out of bound;
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


/*
    🔹 Example
" LOGIC BEHIND THE i>=2 "
Suppose n = 5. Valid indices = 0,1,2,3,4.

Start with i = 4 → sides = [nums[2], nums[3], nums[4]] ✅

Next i = 3 → sides = [nums[1], nums[2], nums[3]] ✅

Next i = 2 → sides = [nums[0], nums[1], nums[2]] ✅

Next i = 1 → sides = [nums[-1], nums[0], nums[1]] ❌ not allowed

Isiliye loop ko i >= 2 tak hi chalana hai, uske baad negative index ho jaayega.
    */

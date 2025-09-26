class Solution {
    public int mySqrt(int x) {
         int s=0;
         int l=x;
         int ans=0;
         if (x<2)
         return x;
         while(s<=l)
         {
            int mid=s+(l-s)/2;
            long sq=(long)mid*mid;
            if(sq==x)
            return mid;
            else if(sq>x)
            l=mid-1;
            else
            {
                ans=mid;
            s=mid+1;
            }
         }
         return ans;
    }
}
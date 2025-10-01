class Solution {
    public int hammingWeight(int n) {
        int count=0;
        int result=0;
        while(n>0)
        {
            count=(n&1);
            n=n>>1;
            if(count==1)
            result++;
        }
        return result;
    }
}
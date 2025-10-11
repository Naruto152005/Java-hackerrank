class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<=0)return false;
        
        // while(n%3==0)
        // {
        //     n=n/3;
        // }
        // return n==1;
       
    if (n <= 0) return false;
    double x = Math.log10(n) / Math.log10(3);
    return x == Math.floor(x);
    }
}
class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int sum=0;
        int reversed=0;
        while(n>0)
        {
            int digit=n%10;
            if(digit!=0)
            {
                x=x*10+digit;
                sum=sum+digit;
            }
            n=n/10;
        }
        while (x != 0) {
                 reversed = reversed * 10 + (x% 10);
                x /= 10;
            }
            return (long) sum *reversed;
    }
}
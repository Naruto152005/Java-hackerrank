class Solution {
    public int addDigits(int num) {
        int sum=0;
        int temp=0;
        if(num<10)
        return num;
        else
        {
            while(num>0)
            {
                temp=num%10;
                sum=sum+temp;
                num=num/10;
            }
        }
        return addDigits(sum);
    }
}
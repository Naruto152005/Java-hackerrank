class Solution {
    public int countEven(int num) {
        int evencount=0;
        for(int i=1;i<=num;i++){
            int sum=0;
            int temp=i;// this will store current element like  example
            /*
            temp=11;
            it will check it more then 0 then if yes
            rem=11%10;--->1;
            sum=0+1;
            temp=11/10--->1;
            again-----|
            rem=1%10;--->1;
            sum=1+1;
            temp=1/10--->0;// after this we will check iif is even or not them increse the count;
            */
            while(temp!=0){
              int rem=temp%10;
              sum+=rem;
              temp/=10;
            }
            if(sum%2==0){
                evencount++;
            }
        }
        return evencount;
    }
}
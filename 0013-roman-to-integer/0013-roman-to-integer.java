class Solution {
    public int Getval(char ch )
        {
            switch(ch){
                case 'I' :return 1;
                case 'V' :return 5;
                case 'X' :return 10;
                case 'L' :return 50;
                case 'C' :return 100;
                case 'D' :return 500;
                case 'M' :return 1000;
                default : return 0;
            }
        }
    public int romanToInt(String s) {
        int n=s.length();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                char ch1=s.charAt(i);

                if(i+1<n&& Getval(ch1)<Getval(s.charAt(i+1)))
                    sum-=Getval(ch1);
                else
                    sum+=Getval(ch1);
            }
            /*
            1)in this logic first it checkking that i is less then n then
            2)after that it checking ch1 value with next ch value
            3)if ch is less then ch+1 then add in that sum with appropriate value;
            4)if the ch is more then ch+1 then decrease the value;
            ------> the task is we have to implement the hashtable process less see;
             */
            return sum;
    }
}
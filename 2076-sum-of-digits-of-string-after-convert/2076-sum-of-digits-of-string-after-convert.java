class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray())
        {
            sb.append(ch-'a'+1);// this will convert String into numlike
            /*
            a-->1 ans b-->2; as i-->9;
            */
        }

        int sum=0;
        for(char c:sb.toString().toCharArray())
        {
            sum+=c-'0';// this will convert this like this 
            /*
                sum=sum+57-48
                sum=sum+9;
                9=9+9;
                18=18+9;
                27=27+9;
                36=36 only because we finished all the inputs from string
            */
        }

        for(int i=1;i<k;i++)// in this we check where k is more than 1 or not if it is then go into loop;
        {
            int temp=0;
            while(sum>0)
            {
                temp+=sum%10;
                sum=sum/10;
            }
            sum=temp;
        }
        return sum;

    }
}
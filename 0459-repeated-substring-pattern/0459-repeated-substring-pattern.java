class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int i=1;
        int len=0;
        int n=s.length();
        int []tsp=new int[n];
        tsp[0]=0;
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(len))
            {
                len++;
                tsp[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                    len=tsp[len-1];
                else{
                    tsp[i]=0;
                    i++;
                }
                    
            }
        }
        //[0,0,1,2]
        //this is  the main logic 
        int last=tsp[n-1];// we taken the highest prefix in lsp 4
        int res=n-last;// then we decrese 4-2=2;
        if(last>0&&n%res==0)//4%2==0
        return true;

        return false;
    }
}
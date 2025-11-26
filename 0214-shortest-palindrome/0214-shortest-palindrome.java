class Solution {
    public void built_lps(String s,int []lps)
    {
        lps[0]=0;// it always 0 because the prefix and suffix initially is empty so 0;
        int i=1;
        int len=0;// you have to learn lps to understand this logic it it will take you hardly 10 min
        int n=s.length();
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                    len=lps[len-1];
                else{
                    lps[i]=0;
                    i++;
                }

            }

        }
    }
    public String shortestPalindrome(String s) {
        int n=s.length();
        String rev=new StringBuilder(s).reverse().toString();// we used the stringbuilder to reverse the string it is easy way and convert this agian into normal string to perfome the opraiotn 
        String s1=s+"/$"+rev;
        int lps[]=new int[s1.length()];
        built_lps(s1,lps);
        
        int longestPalPrefix = lps[lps.length - 1];
        
        // take the unmatched part and prepend it
        String add = rev.substring(0, s.length() - longestPalPrefix);

        return add + s;
    }
}
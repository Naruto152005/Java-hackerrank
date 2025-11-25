class Solution {
    public String longestPrefix(String s) {
       int i=1;
       int len=0;
       int lsp[]=new int[s.length()];
       while(i<s.length())
       {
            if(s.charAt(i)==s.charAt(len))
            {
                len++;
                lsp[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                {
                    len=lsp[len-1];
                }
                else
                {
                    lsp[0]=0;
                    i++;
                }
            }
       }
       int longest=lsp[s.length()-1];
    return s.substring(0,longest);
    }
}
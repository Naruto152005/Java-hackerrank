class Solution {
    public  void build_tsp(String b,int []lsp)
        {
            int i=1;
            int len=0;
            int n=b.length();
            while(i<n)
            {
                if(b.charAt(i)==b.charAt(len))
                {
                    len++;
                    lsp[i]=len;
                    i++;
                }
                else
                {
                    if(len!=0)
                        len=lsp[len-1];
                    else
                    {
                        lsp[i]=0;
                        i++;
                    }
                }
            }
        }
    public int repeatedStringMatch(String a, String b) {
        int i=0;
        int j=0;
        int n=b.length();
        int []lsp=new int[n];
        build_tsp(b,lsp);
        String repated=a;// to know if is poosible to form repated string
        int count=1;

        while(repated.length()<n)
        {
            repated=repated+a;
            count++;
        }
        while(i<repated.length())
        {
            if(repated.charAt(i)==b.charAt(j)){//1) because we chacking here theat if reapted is contains the b substring to form reapted string;
            i++;
            j++;
            if(j==b.length()){// if j==b.length() then we confernming that we successfully getted the repated string b in a and return count;
            return count;
        }
        }
            else
            {
                if(j!=0)
                    j=lsp[j-1];
                else
                    i++;
            }

        }

        repated=repated+a;
        count++;

        while(i<repated.length())
        {
            if(repated.charAt(i)==b.charAt(j)){
            i++;
            j++;
            if(j==b.length()){
            return count;
        }
            }
            else
            {
                if(j!=0)
                    j=lsp[j-1];
                else
                    i++;
            }

            }
        return -1;
        }
}
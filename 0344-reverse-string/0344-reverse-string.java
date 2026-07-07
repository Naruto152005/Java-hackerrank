class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char i=0;
        int j=n-1;
        for(int k=0;k<n/2;k++)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
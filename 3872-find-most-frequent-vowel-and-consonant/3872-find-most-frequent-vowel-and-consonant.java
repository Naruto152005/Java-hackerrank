class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        int []feq=new int[26];
        int mc=0,mv=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            feq[ch-'a']++;// in this will are simply storing the character according to thier ascii value
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            mv=Math.max(mv,feq[ch-'a']);// in this we are checking that how many times that vowels are repeting itself
            else
            mc=Math.max(mc,feq[ch-'a']);// consonents checking like vowels 
        }
        return mv+mc;// finally adding 2of them and returning result;
    }
}
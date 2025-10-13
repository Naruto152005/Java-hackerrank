class Solution {
    public boolean isAnagram(String s, String t) {
        char []chars=s.toCharArray();
        char []ts=t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(ts);

        String s1=new String(chars);
        String s2=new String(ts);

        if(s1.length()<t.length()||s1.length()>t.length())
        return false;
    
        if(s1.contains(s2))
        return true;


        return false;
    }
}
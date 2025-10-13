class Solution {
    public boolean isAnagram(String s, String t) {
        char []chars=s.toCharArray();
        char []ts=t.toCharArray();

        if(s.length()!=t.length())
        return false;
        Arrays.sort(chars);
        Arrays.sort(ts);

        // String s1=new String(chars);
        // String s2=new String(ts);

        
    
       return Arrays.equals(chars,ts);
    }
}
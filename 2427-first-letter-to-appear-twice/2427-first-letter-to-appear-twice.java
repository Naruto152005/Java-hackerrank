class Solution {
    public char repeatedCharacter(String s) {
        Map<Character,Integer>map=new HashMap<>();
        
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
        int count=map.getOrDefault(ch,0);
        if(map.containsKey(ch))
            return ch;
        map.put(ch,count+1);
        }
        
        
        return '$';
    }
}
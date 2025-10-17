class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> se=new HashMap<>();
            se.put('I',1);
            se.put('V',5);
            se.put('X',10);
            se.put('L',50);
            se.put('C',100);
            se.put('D',500);
            se.put('M',1000);
            int sum=0;
            int n=s.length();
            for(int i=0;i<n;i++)
            {
                char ch1=s.charAt(i);
                int num=se.getOrDefault(ch1,0);
                if(i+1<n&&num<se.get(s.charAt(i+1)))
                sum-=se.get(ch1);
                else
                    sum+=se.get(ch1);
            }
            return sum;
    }
}
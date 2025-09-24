class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)
        return "0";

        StringBuilder result=new StringBuilder();
        // this will handles the sign - or + like that and after we can round that with abs
        if(numerator<0 &&denominator>0|| numerator>0&&denominator<0)
        {
            result.append("-");
        }

        long num=Math.abs(Long.valueOf(numerator));
        long deno=Math.abs(Long.valueOf(denominator));
        result.append(num/deno);
        long remainder=num%deno;
        if(remainder==0)
        {
            return result.toString();
        }

        result.append(".");

        Map<Long,Integer> map=new HashMap<>();
        while(remainder!=0)
        {
            if(map.containsKey(remainder))
            {
                int idx=map.get(remainder);
                result.insert(idx,"(");
                result.append(")");
                return result.toString();
            }
            map.put(remainder,result.length());
            remainder=remainder*10;
            result.append(remainder/deno);
            remainder=remainder%deno;// this will check the remainder is 0 or not
        }
        return result.toString();
    }
}
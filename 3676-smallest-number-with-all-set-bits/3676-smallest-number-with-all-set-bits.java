class Solution {
    public int smallestNumber(int n) {
        int X=n;
        while(( X& (X+1))!=0)
        X++;

        return X;
    }
}
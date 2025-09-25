class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            sum+=mat[i][i];// this will handle the original daigonal sum like [1][1]
            if(i!=mat.length-i-1)
                sum+=mat[i][mat.length-i-1];// and this will count from  the end like 
                /*
                sum += mat[1][1] = 5 → sum = 9

                i != n - i - 1 → 1 != 1 ❌ false
                Iteration 3 (i = 2):

            sum += mat[2][2] = 9 → sum = 18

                i != n - i - 1 → 2 != 0 ✅ true
                → sum += mat[2][0] = 7 → sum = 25
                */
        }
        return sum;
    }
}
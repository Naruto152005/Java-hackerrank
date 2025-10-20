class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // int X=0;
        // for(int  i=0;i<operations.length;i++)
        // {
        //     String ch=operations[i];
        //     if(Objects.equals(ch, "X++")) {
        //         X = X++;
        //         X++;
        //     }
        //      if(Objects.equals(ch, "++X"))
        //         X=++X;
        //      if(Objects.equals(ch, "X--")) {
        //          X = X--;
        //          X--;
        //      }
        //      if(Objects.equals(ch, "--X"))
        //         X=--X;
        // }
// my code;
        // return X;
    //---------------------------------------------------------//
         int X = 0;  // start with X = 0
        
        for (String op : operations) {
            if (op.contains("+")) {
                X++;   
            } else {
                X--;  
            }
        }
        // this is a optimized code from other 
        return X;
    }
}
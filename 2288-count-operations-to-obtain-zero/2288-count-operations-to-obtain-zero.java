class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;

        // The loop should continue as long as BOTH numbers are not zero.
        // The moment one of them becomes zero, the process stops.
        while (num1 != 0 && num2 != 0) {
            
            // Perform one operation
            if (num1 >= num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
            
            // Increment the count *after* the operation is done
            count++;
        }

        return count;
    }
}

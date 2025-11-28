class Solution {
    
    public void build_lps(String pat, int[] lps) {
        int len = 0;
        int i = 1;

        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        String txt = s + s; // concatenated string
        int n = txt.length();
        int m = goal.length();

        int[] lps = new int[m];
        build_lps(goal, lps);

        int i = 0, j = 0;

        while (i < n) {
            if (txt.charAt(i) == goal.charAt(j)) {
                i++;
                j++;

                if (j == m)  // full match
                    return true;
            } else {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        return false;
    }
}

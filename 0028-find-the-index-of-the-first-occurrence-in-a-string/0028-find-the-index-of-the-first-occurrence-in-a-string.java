class Solution {
    public int strStr(String haystack, String needle) {
        // int index=-1;
        // index=haystack.indexOf(needle);
        // if(index==-1)
        // return -1;
        // else
        // return index;


        if (needle.isEmpty()) return 0;

        int n = haystack.length();
        int m = needle.length();

        // Step 1: Build LPS for needle
        int[] lps = new int[m];
        int i = 1, len = 0;

        while (i < m) {
            if (needle.charAt(i) == needle.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        // Step 2: Search needle in haystack using LPS
        i = 0;  // index on haystack
        len = 0; // index on needle

        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(len)) {
                i++;
                len++;

                // Found full match!
                if (len == m)
                    return i - m;
            } else {
                if (len > 0) {
                    len = lps[len - 1];
                } else {
                    i++;
                }
            }
        }

        return -1; // not found

    }
}
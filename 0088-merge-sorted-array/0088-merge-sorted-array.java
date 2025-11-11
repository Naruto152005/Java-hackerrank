class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1; // this is because we wanted to interate through full array 

        while(j>=0)// because we are simpply appending the largest element in the last;
        {
            if(i>=0&&nums1[i]>nums2[j])
            nums1[k--]=nums1[i--];
            else
            nums1[k--]=nums2[j--];
        }
    }
}
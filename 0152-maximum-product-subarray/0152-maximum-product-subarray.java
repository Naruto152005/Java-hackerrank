class Solution {
    
    public int max(int a,int b,int c)
    {
        return Math.max(a,Math.max(b,c));
    }
    public int min(int a,int b,int c)
    {
        return Math.min(a,Math.min(b,c));
    }
    int maxProduct(int[] arr) {
        int n=arr.length;
        int currMax=arr[0];
        int currMin=arr[0];
        int maxprod=arr[0];
        
        
        for(int i=1;i<n;i++)
        {
            int temp=max(arr[i],arr[i]*currMax,arr[i]*currMin);
            currMin=min(arr[i],arr[i]*currMax,arr[i]*currMin);
            
            currMax=temp;
            
            maxprod=Math.max(maxprod,currMax);
        }
        return maxprod;
    }
}
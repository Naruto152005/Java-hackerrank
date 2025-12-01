class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer>minheap=new PriorityQueue<>();

        for(int num:nums)
        {
            minheap.add(num);
            if(minheap.size()>k)
                minheap.poll();
        }
        System.gc();
        return minheap.peek();
    }
}
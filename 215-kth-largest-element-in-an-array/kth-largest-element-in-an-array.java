class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(i<k){
                pq.add(nums[i]);
            }else if(pq.peek()>nums[i]){
                continue;
            }else{
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
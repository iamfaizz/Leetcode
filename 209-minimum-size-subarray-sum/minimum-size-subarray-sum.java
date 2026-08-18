class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int low=0;
        int high=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(high<n){
            sum+=nums[high];
            while(sum>=target){
                int len=high-low+1;
                min=Math.min(min,len);
                sum-=nums[low];
                low++;
            }
            high++;

        }
        return min==Integer.MAX_VALUE?0:min;


        
    }
}
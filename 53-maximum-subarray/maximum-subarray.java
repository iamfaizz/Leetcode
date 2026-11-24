class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int end=nums[0];
        int ans=nums[0];

        for(int i=1;i<n;i++){
            int a1=end+nums[i];
            int a2=nums[i];

            end=Math.max(a1,a2);
            ans=Math.max(ans,end);
        }
        return ans;
    }
}
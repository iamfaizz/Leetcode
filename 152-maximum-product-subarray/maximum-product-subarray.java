class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int minend=nums[0];
        int maxend=nums[0];
        int ans=nums[0];

        for(int i=1;i<n;i++){
            int a1=nums[i];
            int a2=minend*nums[i];
            int a3=maxend*nums[i];
           

            maxend=Math.max(a1,Math.max(a2,a3));
            minend=Math.min(a1,Math.min(a2,a3));

            ans=Math.max(ans,Math.max(maxend,minend));


        }
        return ans;
    }
}
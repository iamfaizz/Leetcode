class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int end1=nums[0];
        int ans1=nums[0];
        int end2=nums[0];
        int ans2=nums[0];

        for(int i=1;i<n;i++){
            int a1=end1+nums[i];
            int a2=nums[i];

            int b1=end2+nums[i];
            int b2=nums[i];

            end1=Math.max(a1,a2);
            ans1=Math.max(ans1,end1);

            end2=Math.min(b1,b2);
            ans2=Math.min(ans2,end2);


        }
        return Math.max(ans1,Math.abs(ans2));
    }
}
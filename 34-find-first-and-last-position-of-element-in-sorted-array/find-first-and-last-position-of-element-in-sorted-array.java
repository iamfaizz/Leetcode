class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        res[0]=firstFound(nums,target);
        res[1]=secondFound(nums,target);
        return res;
    }

    private int firstFound(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }

    private int secondFound(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                res=mid;
                low=mid+1;
            }
        }
        return res;
    }
}
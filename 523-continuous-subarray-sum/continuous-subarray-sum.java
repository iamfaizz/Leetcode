class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;

            Integer pre = map.get(rem);
            if(pre != null){ 
                if(i - pre >= 2){

                return true;
                }
            }else{
                map.put(rem, i);
            }
        }
    return false;
    }
}
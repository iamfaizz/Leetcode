class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int res=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int a=sum%k;
            if(a<0){
                a+=k;
            }
            if(map.containsKey(a)){
                res+=map.get(a);
            }
            map.put(a,map.getOrDefault(a,0)+1);
        }
        return res;
    }
}
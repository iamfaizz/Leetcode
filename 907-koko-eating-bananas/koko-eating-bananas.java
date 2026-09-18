class Solution {
    
    private long totalHours(int[] piles, int k){
        int n=piles.length;
        long hr=0;

        for(int i=0;i<n;i++){
            hr+=piles[i]/k;
            if(piles[i]%k!=0){
                hr++;
            }
        }
        return hr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        int ans=-1;

        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<=high){
            int mid=(low+high)/2;
            long hour=totalHours(piles,mid);

            if(hour>h){
                low=mid+1;

            }else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;


    }
}
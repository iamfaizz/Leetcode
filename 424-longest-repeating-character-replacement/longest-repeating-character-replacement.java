class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] arr=new int[26];
        int low=0;
        int high=0;
        int res=0;
        int max=0;
        for(high=0;high<n;high++){
            arr[s.charAt(high)-'A']++;
            max=Math.max(max,arr[s.charAt(high)-'A']);
            
            if(high-low+1-max>k){
                arr[s.charAt(low)-'A']--;
                low++;


            }
            
            res=Math.max(res,high-low+1);


        }
        return res;
        
    }
}
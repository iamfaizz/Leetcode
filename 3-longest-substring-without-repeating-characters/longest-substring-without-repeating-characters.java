class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int low=0;
        int high=0;
        int maxLen=0;
        for(high=0;high<n;high++){
            char c=s.charAt(high);
            if(map.containsKey(c)){
                low=Math.max(low,map.get(c)+1);
            }
            map.put(c,high);
            int len=high-low+1;
            maxLen=Math.max(maxLen,len);
        }
        return maxLen;
    }
}
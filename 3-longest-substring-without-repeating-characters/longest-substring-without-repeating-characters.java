class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int low=0;
        int high=0;
        int maxLen=0;

        for(high=0;high<n;high++){
            char ch=s.charAt(high);
            if(map.containsKey(ch)){
                low=Math.max(low,map.get(ch)+1);
            }
            map.put(ch,high);
            int len=high-low+1;
            maxLen=Math.max(maxLen,len);
        }
        return maxLen;
    }
}
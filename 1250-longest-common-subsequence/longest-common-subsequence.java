class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int[] dp=new int[n];
        int longest=0;

        for(char ch:text2.toCharArray()){
            int curlen=0;
            for(int i=0;i<dp.length;i++){
                if(dp[i]>curlen){
                    curlen=dp[i];
                }else if(ch==text1.charAt(i)){
                    dp[i]=curlen+1;
                    longest=Math.max(longest,curlen+1);
                }
            }
        }
        return longest;
    }
}
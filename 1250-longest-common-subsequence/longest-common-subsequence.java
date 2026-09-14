class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int[] dp=new int[n];
        int longest=0;

        for(char ch:text2.toCharArray()){
            int curLen=0;
            for(int i=0;i<dp.length;i++){
                if(curLen<dp[i]){
                    curLen=dp[i];
                }else if(ch==text1.charAt(i)){
                    dp[i]=curLen+1;
                    longest=Math.max(longest,curLen+1);
                }
            }
        }
        return longest;
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m=magazine.length();
        
        if(n>m) return false;

        int[] ans=new int[26];
        for(char ch: magazine.toCharArray())
        ans[ch-'a']++;

        for(char ch: ransomNote.toCharArray()){
            if(ans[ch-'a']==0) return false;
            ans[ch-'a']--;
        }
        return true;
    }
}
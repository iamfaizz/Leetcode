class Solution {
    public static String sortString(String s){
        char c[]=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
   
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        if(s.length()!=t.length())
        return false;
        s=sortString(s);
        t=sortString(t);
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=t.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<int[]> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek()[0]==c){
                st.peek()[1]++;
                
                if(st.peek()[1]==k){
                    st.pop();
                }
            }else{
                st.push(new int[]{c,1});
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int[] pair:st){
            char c=(char) pair[0];
            int count=pair[1];

            while(count-->0){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
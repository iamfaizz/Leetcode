class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        for(char ch:stack){
            res.append(ch);
        }
        return res.toString();
        
    }
}
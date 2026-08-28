class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int[] res=new int[n];
        
        Arrays.fill(res,-1);
        for(int i=2*n-1;i>=0;i--){
            int ind=i%n;
            while(!st.isEmpty() && st.peek()<=nums[ind]){
                st.pop();
            }

                if(i<n && !st.isEmpty()){
                    res[ind]=st.peek();
                   
                } 
                st.push(nums[ind]);
                 
            
               
        }
        
        return res;
    }
}
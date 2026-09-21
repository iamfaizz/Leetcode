class Solution {
    private int fun(int[][] matrix, int n, int mid){
        int row=n-1;
        int col=0;
        int count=0;

        while(row>=0 && col<n){
            if(matrix[row][col]<=mid){
                count=count+row+1;
                col++;
            }else{
                row--;
            }
        }
        return count;

    }
    
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        int res=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=fun(matrix,n,mid);

            if(ans<k){
                low=mid+1;
            }else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
}
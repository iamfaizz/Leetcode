class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int freshcount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    freshcount++;
                }
            }
        }

        if(freshcount==0) return 0;

        int time=-1;
        int[][] x={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            time++;
            int size=q.size();
            for(int i=0;i<size;i++){
            int[] curr=q.poll();
            for(int[] z:x){
                int nr=curr[0]+z[0];
                int nc=curr[1]+z[1];

                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
                    grid[nr][nc]=2;
                    q.offer(new int[]{nr,nc});
                    freshcount--;
                }
            }
        }
        }
            
        if(freshcount==0){
            return time;
        }else{
            return -1;
        }
    }
}
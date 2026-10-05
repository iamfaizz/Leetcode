class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<Integer> diary=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        result(candidates,n,0,diary,0,res,target);
        return res;
    }

    void result(int[] candidates,int n,int ind, List<Integer> diary, int sum, List<List<Integer>> res, int target){

        if(ind==n || sum>target){
            return;
        }

        if(sum==target){
                res.add(new ArrayList(diary));
                return;
        }
            
        

        result(candidates,n,ind+1,diary,sum,res,target);

        if(candidates[ind]+sum<=target){
            diary.add(candidates[ind]);
            sum=sum+candidates[ind];

        
        result(candidates,n,ind,diary,sum,res,target);
        diary.remove(diary.size()-1);
        sum=sum-candidates[ind];
        }
    }
}
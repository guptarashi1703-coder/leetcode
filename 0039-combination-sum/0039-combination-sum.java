class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        fun(candidates,target,0,curr,ans);
        return ans;
    }public void fun(int[] candidates,int target,int index,List<Integer>curr,List<List<Integer>> ans){
        if(index==candidates.length){
            return;
        }if(target==0){
            ans.add(new ArrayList<>(curr));
            return ;
        }if(candidates[index]<=target){
            curr.add(candidates[index]);
            fun(candidates,target-candidates[index],index,curr,ans);
            curr.remove(curr.size()-1);
         } fun(candidates,target,index+1,curr,ans);
    }
}
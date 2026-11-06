class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
         List<Integer> curr=new ArrayList<>();
         fun(1,n,k,curr,ans);
         return ans;
    }
    public void fun(int start,int n,int k,List<Integer> curr,List<List<Integer>> ans){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }for(int i=start;i<=n;i++){
            curr.add(i);
            fun(i+1,n,k,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}
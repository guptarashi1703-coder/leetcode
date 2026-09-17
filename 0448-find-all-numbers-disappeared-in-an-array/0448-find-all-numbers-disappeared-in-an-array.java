class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      HashMap<Integer,Boolean> map=new HashMap<>();
      List<Integer> ans=new ArrayList<>();
      for(int n:nums){
        map.put(n,true);
      }for(int i=1;i<=nums.length;i++){
        if(!map.containsKey(i))
        ans.add(i);
      }return ans;
    }
}
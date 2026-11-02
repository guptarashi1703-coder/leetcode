class Solution {
    public List<Integer> stableMountains(int[] nums,int threshold){
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=1;i<nums.length;i++){
        if(nums[i-1]>threshold){
            ans.add(i);
        }
       }
       return ans;
    }
}
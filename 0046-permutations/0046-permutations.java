class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        perm(nums,0,ans);
        return ans;
    }
    public void perm(int[] nums,int start,List<List<Integer>> ans){
       if(start==nums.length){
        List<Integer>tmp=new ArrayList<>();
        for(int i:nums){
            tmp.add(i);
        }
        ans.add(tmp);
        return;
       }
        for(int i=start;i<nums.length;i++){
            int temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
            perm(nums,start+1,ans);
             temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
        }
        }
}
class Solution {
    public int sortPermutation(int[] nums) {
     int n=-1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]!=i)
        n&=nums[i];
     }return Math.max(n,0);   
    }
}
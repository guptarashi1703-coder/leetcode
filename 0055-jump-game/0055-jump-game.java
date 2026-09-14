class Solution {
    public boolean canJump(int[] nums) {
        int s=nums.length-1;
     for(int i=nums.length-2;i>=0;i--){
        if(i+nums[i]>=s)
        s=i;
     }
     return s==0;  
    }
}
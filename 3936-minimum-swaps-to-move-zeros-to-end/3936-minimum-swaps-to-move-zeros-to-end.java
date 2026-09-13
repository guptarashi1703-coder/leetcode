class Solution {
    public int minimumSwaps(int[] nums) {
        int r=nums.length-1;
        int c=0;
        int l=0;
        while(l<r){
            while(l<nums.length && nums[l]!=0)
            l++;
            while(r>=0 && nums[r]==0)
            r--;
        if(l<r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
        c++;
        }
        }return c;
    }
}
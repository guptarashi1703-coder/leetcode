class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int max=0;
       for(int a:map.values()){
        if(a>max)
        max=a;
       }int c=0;
       for(int a:map.values()){
        if(a==max)
        c+=a;
       }return c;
    }
}
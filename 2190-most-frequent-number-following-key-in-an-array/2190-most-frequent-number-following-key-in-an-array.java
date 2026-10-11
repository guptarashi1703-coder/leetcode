class Solution {
    public int mostFrequent(int[] nums, int key) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==key){
        map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
    }
    }int max=0;
    int ans=0;
    for(int a:map.keySet()){
        if(map.get(a)>max){
        max=map.get(a);
        ans=a;
        }
    }return ans;
    }
}
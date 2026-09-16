class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     HashMap<Integer,Integer> map=new HashMap<>();
     map.put(0,1);
     int s=0; int c=0;
       for(int i=0;i<nums.length;i++){
        s+=nums[i];
        int r=((s%k)+k)%k;
        if(map.containsKey(r)){
            c+=map.get(r);
        }map.put(r,map.getOrDefault(r,0)+1);
       }return c;
    }
}
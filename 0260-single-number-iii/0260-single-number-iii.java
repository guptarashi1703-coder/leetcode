class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      } for(int ele:map.keySet()){
        if(map.get(ele)==1){
            list.add(ele);
        }
       }
        int[] res=new int[list.size()];
        for(int j=0;j<list.size();j++){
            res[j]=list.get(j);
        }
    return res;
    }
}
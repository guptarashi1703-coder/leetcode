class Solution {
    public int countGoodSubstrings(String s) {
     char[] arr=s.toCharArray();
     int l=0;
     int c=0;
     HashMap<Character, Integer> map=new HashMap<>();
     for(int r=0;r<arr.length;r++){
        char ch=arr[r];
        map.put(ch,map.getOrDefault(ch,0)+1);
        if(r-l+1==3){
            if(map.size()==3)
            c++;
            map.put(arr[l],map.get(arr[l])-1);
            if(map.get(arr[l])==0)
                map.remove(arr[l]);
                l++;
        }
     }return c;
    }
}
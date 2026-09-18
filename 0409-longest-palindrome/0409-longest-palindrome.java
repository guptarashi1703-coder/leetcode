class Solution {
    public int longestPalindrome(String s) {
     HashMap<Character,Integer>map=new HashMap<>();
     for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
      } int l=0;
      boolean oddc=false;
      for(int f:map.values()){
      if(f%2==0){
      l+=f;
      }else{
      l+=f-1;
      oddc=true;
        }
        }  if(oddc)
        l+=1;
        return l;
    }
}
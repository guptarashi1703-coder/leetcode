class Solution {
    public String customSortString(String order, String s) {
 HashMap<Character,Integer> map=new HashMap<>();
 for(char c:s.toCharArray()){
    map.put(c,map.getOrDefault(c,0)+1);
 } String str="";
   for(char c:order.toCharArray()){
    if(map.containsKey(c)){
    int n=map.get(c);
    for(int i=0;i<n;i++){
        str+=c;
    }map.remove(c);
    }
 }for(char c:map.keySet()){
    int n=map.get(c);
    for(int i=0;i<n;i++)
    str+=c;
 }return str;
    }
}
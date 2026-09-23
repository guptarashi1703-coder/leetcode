class Solution {
    public int reverseDegree(String s) {
   int sum=0;
   for(int i=1;i<=s.length();i++){
   int r=Math.abs(26-(s.charAt(i-1)-'a'));
   sum+=i*r;
   }return sum;  
    }
}
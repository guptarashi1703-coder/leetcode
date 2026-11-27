class Solution {
    public String countAndSay(int n) {
          if(n==1){
            return "1";
        }
        String s=countAndSay(n-1);
         StringBuilder ans=new StringBuilder();
        int c=1;
      for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }else{
                ans.append(c).append(s.charAt(i-1));
                c=1;
            }
        }ans.append(c).append(s.charAt(s.length()-1));
        return ans.toString();
    }
}
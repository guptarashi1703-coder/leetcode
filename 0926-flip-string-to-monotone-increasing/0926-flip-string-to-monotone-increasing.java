class Solution {
    public int minFlipsMonoIncr(String s) {
        int f=0;int one=0;
        for(char c:s.toCharArray()){
        if(c=='1'){
         one++;
        }else{
            f=Math.min(f+1,one);
        }
        }return f;
    }
}
class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
       for(int i=0;i<=n;i++){
        int c=0;
        int num=i;
        while(num>0){
            int bit=num%2;
            if(bit==1){
            c++;
            }
            num/=2; 
        }ans[i]=c;
       }  return ans;
    }
}
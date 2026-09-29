class Solution {
    public int largestAltitude(int[] gain) {
      int[] l=new int[gain.length+1];
        l[0] = 0;
        int max =0;
        for(int i=1;i<l.length;i++){
            l[i] = l[i-1]+gain[i-1];
            if(l[i]>max)
            max=l[i];
          }  return max;   
    }
}
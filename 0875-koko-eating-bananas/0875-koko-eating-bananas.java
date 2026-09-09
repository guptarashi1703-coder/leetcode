class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int l=1;
    int r=0;
     for(int i=0;i<piles.length;i++){
        r=Math.max(r,piles[i]);
    }while(l<=r){
        int mid=l+(r-l)/2;
        long hrs=0;
        for(int i:piles){
            hrs+=Math.ceil((double)i/mid);
        }if(hrs<=h){
            r=mid-1;
        }else{
            l=mid+1;
        }
    }return l;
    }
}
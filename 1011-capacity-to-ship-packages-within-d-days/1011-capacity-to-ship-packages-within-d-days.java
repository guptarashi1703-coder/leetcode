class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int l=0;
       int r=0;
       for (int w : weights) {
       l= Math.max(l, w);
       r+= w;
    }while (l<r) {
      int mid = l+(r-l)/2;
     int currentLoad = 0;
      int requiredDays = 1;
     for (int w : weights) {
     if (currentLoad + w > mid) {
       requiredDays++;
       currentLoad = 0;
}   currentLoad += w;
}if (requiredDays <= days)
    r= mid;
  else 
    l = mid + 1;
}return l;
    }
}
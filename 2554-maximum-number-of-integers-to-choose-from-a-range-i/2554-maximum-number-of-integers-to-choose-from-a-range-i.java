class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set=new HashSet<>();
        for(int a:banned){
            if(a<=n)
            set.add(a);
        }int c=0;
        int s=0;
        for(int i=1;i<=n;i++){
            if(set.contains(i)) 
            continue;
            if(s+i>maxSum)
            break;
            s+=i;
            c++;
        }return c;
    }
}
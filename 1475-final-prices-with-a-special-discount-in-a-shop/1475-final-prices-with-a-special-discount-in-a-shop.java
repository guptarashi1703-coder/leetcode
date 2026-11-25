class Solution {
    public int[] finalPrices(int[] prices) {
     Stack<Integer> st=new Stack<>();
        int[] ans=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            ans[i]=prices[i];
            while(!st.isEmpty() && prices[i]<=prices[st.peek()]){
                int index=st.pop();
                ans[index]-=prices[i];
            }st.push(i);
        }return ans;
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[heights.length];
        Arrays.fill(nse,heights.length);
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                nse[st.pop()]=i;
            }st.push(i);
        }st.clear();
        int[] pse=new int[heights.length];
        Arrays.fill(pse,-1);
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                pse[st.pop()]=i;
            }st.push(i);
        }
        int max=0;
        for(int i=0;i<heights.length;i++){
       int  w=nse[i]-pse[i]-1;
        max=Math.max(max,w*heights[i]);
        }return max;
    }
}
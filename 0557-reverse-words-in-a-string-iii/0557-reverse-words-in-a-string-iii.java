class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
    StringBuilder r=new StringBuilder();
    for(int i=0;i<arr.length;i++){
        r.append(new StringBuilder(arr[i]).reverse());
        if(i<arr.length-1){
            r.append(" ");
        }
    }return r.toString();
    }
}
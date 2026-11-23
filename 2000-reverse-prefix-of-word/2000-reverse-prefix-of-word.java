class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
             index=i;
             break;
            }
        }if(index==-1){
            return word;
        }int l=0;
        int r=index;
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }return new String(arr);
    }
}
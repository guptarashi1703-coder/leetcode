class Solution {
    public int maxVowels(String s, int k) {
     int max=0; int c=0;   
     for(int i=0;i<k;i++){
        if(isVow(s.charAt(i)))
        c++;
     }max=c;
     for(int i=k;i<s.length();i++){
        if(isVow(s.charAt(i)))
        c++;
        if(isVow(s.charAt(i-k)))
        c--;
        max=Math.max(max,c);
     }return max;
    }public static boolean isVow(char c){
        return (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u');
    }
}
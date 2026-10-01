class Solution {
    public int percentageLetter(String s, char letter) {
     int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-97]++;
        }int r=freq[letter-97];
        int p=(r)*100/s.length();
        return p;       
    }
}
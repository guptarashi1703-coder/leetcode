class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] st=(s1+" "+s2).split(" ");
        List<String> res=new ArrayList<>();
        for(int i=0;i<st.length;i++){
        int c=0;
        for(int j=0;j<st.length;j++){
            if(st[i].equals(st[j]))
            c++;
        } if(c==1)
        res.add(st[i]);
    }return res.toArray(new String[0]);
    }
}
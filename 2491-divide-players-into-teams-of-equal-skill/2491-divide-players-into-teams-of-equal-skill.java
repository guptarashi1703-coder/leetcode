class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long ans=0;
        long sum=(long)skill[0]+skill[skill.length-1];
        for(int i=0;i<skill.length/2;i++){
            if((long)skill[i]+skill[skill.length-1-i]!=sum){
            return -1;
        } ans+=(long)skill[i]*skill[skill.length-1-i];
        }return ans;
    }
}
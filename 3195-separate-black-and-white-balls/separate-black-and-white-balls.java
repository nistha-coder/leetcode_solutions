class Solution {
    public long minimumSteps(String s) {
        int i=0;
        long count=0;
        long ans=0;
        while(i<s.length()){
            if(s.charAt(i)=='1')count++;
            else{
                ans+=count;

            }
            i++;
        }
        return ans;
        
    }
}
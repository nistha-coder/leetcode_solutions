class Solution {
    public int helper(int sign, String s, int i, long result){
        if(i>=s.length()||!Character.isDigit(s.charAt(i)))return (int) result*sign;
        result=result*10+(s.charAt(i)-'0');
        if(sign*result>=Integer.MAX_VALUE)return Integer.MAX_VALUE;
        if(sign*result<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return helper(sign,s,i+1,result);
    }
    public int myAtoi(String s) {
        int len= s.length();
        int i=0;
        while(i<len && s.charAt(i)==' ')i++;
        int sign=1;
        if(i<len){
            if(s.charAt(i)=='-'){sign=-1;i++;}
            else if(s.charAt(i)=='+')i++;
            
        }
        long result=0;
        return helper(sign,s,i,result);
       
        
    }
}
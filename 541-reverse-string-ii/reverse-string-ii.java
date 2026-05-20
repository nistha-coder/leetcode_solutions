class Solution {
    public String reverseStr(String s, int k) {
        int i=0;
        StringBuilder sb = new StringBuilder(s);
        while(i<s.length()){
            int j=Math.min(i+k,s.length())-1;
            int end=j;
            while(i<j){
                char temp= sb.charAt(i);
                 sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            i=end+k+1;
        }

        return sb.toString();
    }
}
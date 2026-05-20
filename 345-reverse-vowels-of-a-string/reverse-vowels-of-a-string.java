class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int j= s.length()-1;
        while(i<j){
            if(isvowel(sb.charAt(i))&& isvowel(sb.charAt(j))){
                char temp=sb.charAt(i);
                 sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            else if(isvowel(sb.charAt(i)))j--;
            else if(isvowel(sb.charAt(j)))i++;
            else {
                i++;
                j--;
            }
        }
        return sb.toString();
    }
    public boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || 
   ch == 'o' || ch == 'u') {
        return true;
    }
    return false;
}
}
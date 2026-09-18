class Solution {
    public void helper( List<String> ans, StringBuilder sb, int n,int count){
        if(sb.length()==n*2){
            ans.add(sb.toString());
        }
        if(count>=sb.length()-count && count<n){
            helper(ans,sb.append('('),n,count+1);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(sb.length()-count<n && count>sb.length()-count){
            helper(ans,sb.append(')'),n,count);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        helper(ans,new StringBuilder(),n,0);
        return ans;
    }
}
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
          StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.length;i++){
            int total=0;
            for(int j=0;j<words[i].length();j++){
                int idx= words[i].charAt(j)-'a';
                total+=weights[idx];
            }
            int temp = total%26;
            char c= (char)('z'-temp);
            ans.append(c);

        }
        return ans.toString();
    }
}
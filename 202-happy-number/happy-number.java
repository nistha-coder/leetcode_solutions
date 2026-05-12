class Solution {
    public int find(int n){
         int sum=0;
            while(n>0){
                int temp = n%10;
                sum+=temp*temp;
                n/=10;
            }
            return sum;
        }
    
    public boolean isHappy(int n) {
           
        int slow= find(n);
        int fast= find(find(n));
        while(slow!=fast){
            slow=find(slow);
            fast= find(find(fast));
        }
        return slow==1;
    }
}
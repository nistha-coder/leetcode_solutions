class Solution {
    public double help(double x, long n){
        if(n==1)return x;
        double half= help(x,n/2);
        
        if(n%2!=0){
            return half*half*x;
        }
        return half*half;
    }
    public double myPow(double x, int n) {
        if(n==0)return 1;
        double ans= help(x,Math.abs((long)n));
        if(n<0)return 1/ans;
        return ans;
    }
}
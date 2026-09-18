class Solution {
    public long power(long n,long x){
        if(n==1)return x;
        if(n==0)return 1;
        long half= power(n/2,x);
        if(n%2==0){
            return (half*half)%1000000007;
        }
        return (((half*half)%1000000007)*x)%1000000007;
    }
    public int countGoodNumbers(long n) {
        int ans=1;
        int mod= 1000000007;
        long even = power((n+1)/2,5);
        long odd= power(n/2,4);
        return (int)((even*odd)%mod);

    }
}
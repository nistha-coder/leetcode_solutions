class Solution {
    public String multiply(String num1, String num2) {
        int n =num1.length();
        int m =num2.length();
        int[] arr= new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int p1= i+j;
                int p2=i+j+1;
                int x= (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                x+=arr[p2];
                arr[p2]=(x)%10;
                arr[p1]+=x/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<(n+m-1) && arr[i]==0)i++;
        while(i<n+m){
            sb.append(arr[i]);
            i++;
        }
        return sb.toString();
   }
}
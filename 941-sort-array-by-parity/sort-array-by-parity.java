class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(k<=j){
            if(nums[k]%2==0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;
                k++;
            }else{
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                j--;

            }
        }
        return nums;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int actual_size = nums.length;
        int sum1 = Rsum(actual_size);
        int sum2 = Asum(nums);
        return (sum1-sum2);
    }
    public int Rsum(int n){
        int sum=0;
        for(int i=0 ; i<=n ;i++){
            sum=sum+i;
        }
        return sum;
    }

    public int Asum(int[] nums){
        int sum=0;
        for(int i=0 ; i<nums.length ; i++)
        {
            sum=sum+nums[i];
        }
        return sum;
    }
}
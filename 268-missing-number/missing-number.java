class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int arrsum=0;
        int n_sum=(l)*(l+1)/2;
        for(int num:nums){
            arrsum+=num;
        }
        return n_sum-arrsum;
    }
}
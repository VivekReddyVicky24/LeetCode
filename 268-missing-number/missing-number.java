class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int xor=l;
        for(int i=0;i<l;i++){
            xor=xor^i^nums[i];
        }
        return xor;
    }
}
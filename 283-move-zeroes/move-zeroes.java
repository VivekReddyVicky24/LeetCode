class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int low=0;
        for(int i=0;i<l;i++){
            if(nums[i]!=0){
                int temp=nums[low];
                nums[low]=nums[i];
                nums[i]=temp;
                low++;
            }
        }
    }
}
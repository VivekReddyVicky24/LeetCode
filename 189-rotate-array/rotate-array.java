class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k=k%l;
        reverse(0,l-1,nums);
        reverse(0,k-1,nums);
        reverse(k,l-1,nums);

    }
    public void reverse(int start,int end,int[] nums){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
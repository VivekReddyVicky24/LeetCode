class Solution {
    public int findDuplicate(int[] nums) {
        int[] a=new int[100001];
        for(int i=0;i<nums.length;i++){
            a[nums[i]]++;
            if(a[nums[i]]>=2){
                return nums[i];
            }
        }
        return -1;
    }
}
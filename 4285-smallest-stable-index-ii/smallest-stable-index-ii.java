class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l=nums.length;
        int[] prefixMax=new int[l];
        prefixMax[0]=nums[0];
        for(int i=1;i<l;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],nums[i]);
        }
        int suffixMax=nums[l-1];
        for(int i=l-1;i>=0;i--){
            suffixMax=Math.min(suffixMax,nums[i]);
            prefixMax[i]=prefixMax[i]-suffixMax;
        }
        for(int i=0;i<l;i++){
            if(prefixMax[i]<=k){
                return i;
            }
        }
        return -1;
    }
}
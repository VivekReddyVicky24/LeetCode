class Solution {
    public int missingInteger(int[] nums) {
        int l=nums.length;
        int maxSum=nums[0];
        for(int i=1;i<l;i++){
            if(nums[i]==nums[i-1]+1){
                maxSum+=nums[i];
            }
            else{
                break;
            }
        }
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<l;i++){
            h.add(nums[i]);
        }
        int ans=maxSum;
        while(true){
            if(!h.contains(ans++)){
                return ans-1;
            }
        }
    }
}
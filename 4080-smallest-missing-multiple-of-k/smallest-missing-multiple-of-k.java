class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        
        for(int i=1;i<=10000;i++){
            
            if(!h.contains(k*i)){
                return k*i;
            }
        }
        return k;
    }
}
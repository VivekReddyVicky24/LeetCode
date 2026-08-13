class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        boolean[] vis = new boolean[n+1];

        for(int num : nums) {
            if(vis[num]) {
                return num;
            }
            vis[num] = true;
        }
        return n-1;
    }
}
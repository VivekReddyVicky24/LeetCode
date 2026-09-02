class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int duplicate=0;
        int total_Sum=0;
        int[] num=new int[2];
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            if(h.contains(nums[i])){
                duplicate=nums[i];    
            }
            else{
                h.add(nums[i]);
                total_Sum+=nums[i];
            }

        }
        num[0]=duplicate;
        num[1]=sum-total_Sum;
        return num;


    }
}
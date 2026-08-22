class Solution {
    public boolean checkDivisibility(int n) {
        int dummy=n;
        int sum=0;
        int prod=1;
        while(dummy>0){
            sum+=dummy%10;
            prod*=dummy%10;
            dummy/=10;
        }
        return n%(sum+prod)==0;
    }
}
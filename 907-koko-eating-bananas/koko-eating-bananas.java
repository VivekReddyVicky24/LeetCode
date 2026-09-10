import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // 1. The minimum speed Koko can eat is 1 banana per hour.
        int low = 1; 
        // 2. The maximum useful speed is the size of the largest pile.
        int high = Arrays.stream(piles).max().getAsInt(); 
        int ans = high;

        // Binary Search for the minimum valid speed
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if Koko can finish all piles at speed 'mid'
            if (canFinish(piles, mid, h)) {
                ans = mid;        // 'mid' works, record it as a potential answer
                high = mid - 1;   // Try to find a smaller valid speed
            } else {
                low = mid + 1;    // Too slow, we need a faster speed
            }
        }
        return ans;
    }
    
    // Helper method to calculate if Koko can finish within h hours
    private boolean canFinish(int[] piles, int speed, int h) {
        long totalHours = 0; // Use long to prevent integer overflow for large test cases
        
        for (int pile : piles) {
            // Ceiling division: formula to round up (pile / speed)
            totalHours += (pile + speed - 1) / speed;
            
            // Optimization: If hours already exceed h, no need to check further
            if (totalHours > h) {
                return false;
            }
        }
        return totalHours <= h;
    }
}

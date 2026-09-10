class Solution {

    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {

                // Is target inside the sorted left half?
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } 
                else {
                    low = mid + 1;
                }
            }

            // Otherwise, right half is sorted
            else {

                // Is target inside the sorted right half?
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } 
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}





// class Solution {

//     public int search(int[] nums, int target) {

//         int n = nums.length;

//         int low = 0;
//         int high = n - 1;

//         // Step 1: Find the index of the minimum element
//         while (low < high) {

//             int mid = low + (high - low) / 2;

//             if (nums[mid] > nums[high]) {
//                 // Minimum is on the right side
//                 low = mid + 1;
//             } 
//             else {
//                 // Minimum is at mid or on the left side
//                 high = mid;
//             }
//         }

//         // high (or low) is now the index of the minimum element

//         // Step 2: If array is not rotated,
//         // search the entire array
//         if (high == 0) {
//             return check(nums, 0, n - 1, target);
//         }

//         // Step 3: Decide which sorted half to search
//         if (target >= nums[0]) {
//             // Target is in the left sorted portion
//             return check(nums, 0, high - 1, target);
//         } 
//         else {
//             // Target is in the right sorted portion
//             return check(nums, high, n - 1, target);
//         }
//     }

//     // Normal Binary Search
//     int check(int[] nums, int start, int end, int target) {

//         while (start <= end) {

//             int mid = start + (end - start) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             }

//             else if (nums[mid] < target) {
//                 start = mid + 1;
//             }

//             else {
//                 end = mid - 1;
//             }
//         }

//         return -1;
//     }
// }
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1; // Target in left half
                } else {
                    l = mid + 1; // Target in right half
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1; // Target in right half
                } else {
                    r = mid - 1; // Target in left half
                }
            }
        }

        return -1;
    }
}

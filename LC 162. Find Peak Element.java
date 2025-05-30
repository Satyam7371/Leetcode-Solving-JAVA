class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak lies on the left (including mid)
                right = mid;
            } else {
                // Peak lies on the right
                left = mid + 1;
            }
        }

        return left; // or right, both are equal
    }
}

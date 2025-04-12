class Solution {
    public int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length-1;
        while(st<=end) {
            int mid = st + (end-st) / 2;
            if(nums[mid]==target) {
                return mid;
            }
            else if(target>nums[mid]) {
                st = mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

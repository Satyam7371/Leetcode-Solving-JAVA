class Solution {
    public int firstOccurence(int[] nums,int target) {
        int st = 0;
        int end = nums.length-1;
        int first = -1;
        while(st<=end) {
            int mid = st + (end - st) / 2;

            if(nums[mid]==target) {
                first = mid;
                end = mid-1;  // check on left side
            }
            else if(target<nums[mid]) {
                end = mid-1;
            }
            else {
                st = mid + 1;
            }
        }
        return first;
    }

    public int lastOccurence(int[] nums, int target) {
        int st = 0;
        int end = nums.length-1;
        int last = -1;
        while(st<=end) {
            int mid = st + (end - st) / 2;

            if(nums[mid]==target) {
                last = mid;
                st = mid+1;    // check on right side
            }
            else if(target<nums[mid]) {
                end = mid-1;
            }
            else {
                st = mid + 1;
            }
        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums,target);
        int last = lastOccurence(nums,target);

        return new int[] {first,last};
    }
}

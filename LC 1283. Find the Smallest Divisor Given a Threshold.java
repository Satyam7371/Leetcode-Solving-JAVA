class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxVal = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i]>maxVal) {
                maxVal = nums[i];
            }
        }
        int ans = maxVal;
        int l = 1;
        int r = maxVal;
        while(l<=r) {
            int mid = l + (r - l)/2;
            int sum = 0;
            for(int i=0;i<n;i++) {
                sum += (nums[i] + mid - 1) / mid;
            }
            if(sum>threshold) {
                l = mid + 1;
            }
            else {
                ans = mid;
                r = mid-1;
            }
        }
        return ans;
    }
}

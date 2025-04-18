class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0;
        int prevL = -1;
        int prevR = -1;
        for(int i=1;i<nums.length-1;i++) {
            int l = i-1;
            int r = i+1;

            while(l>0 && nums[l]==nums[i]) {
                l--;
            }
            while(r<nums.length-1 && nums[r]==nums[i]) {
                r++;
            }
            if(nums[i]>nums[l] && nums[i]>nums[r] && l!=prevL && r!=prevR) {
                ans++;
            }
            else if(nums[i]<nums[l] && nums[i]<nums[r] && l!=prevL && r!=prevR) {
                ans++;
            }
            prevL = l;
            prevR = r;
        }
        return ans;
    }
}

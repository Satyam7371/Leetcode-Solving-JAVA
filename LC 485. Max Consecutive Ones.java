class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = nums[0];
        int maxcnt = cnt;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==1) {
                if(nums[i-1]==1) {
                    cnt++;
                }
                else cnt = 1;
            }
            maxcnt = Math.max(maxcnt,cnt);
        }
        return maxcnt;
    }
}

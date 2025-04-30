class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++) {
            int x = nums[i];
            int count = 0;
            while(x!=0) {
                x = x/10;
                count++;
            }
            if(count%2==0) {
                ans++;
            }
        }
        return ans;
    }
}

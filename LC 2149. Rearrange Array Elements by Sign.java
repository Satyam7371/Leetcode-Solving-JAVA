class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int a=0,b=0;
        for(int i=0;i<n;i++) {
            if(nums[i]>0) {
                positive[a] = nums[i];
                a++;
            }
            else if(nums[i]<0) {
                negative[b] = nums[i];
                b++;
            }
        }
        int[] ans = new int[n];
        a = 1;
        b = 1;
        ans[0] = positive[0];
        ans[1] = negative[0];
        for(int i=2;i<n;i++) {
            if(i%2==0) {
                ans[i] = positive[a];
                a++;
            }
            else {
                ans[i] = negative[b];
                b++;
            }
        }
        return ans;
    }
}

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for(int i=0;i<n;i++) {
            if(nums[i]==0) count_0++;
            else if(nums[i]==1) count_1++;
            else if(nums[i]==2) count_2++;
        }
        for(int i=0;i<n;i++) {
            if(count_0>0) {
                nums[i] = 0;
                count_0--;
            }
            else if(count_1>0) {
                nums[i] = 1;
                count_1--;
            }
            else if(count_2>0) {
                nums[i] = 2;
                count_2--;
            }
        } 
    }
}

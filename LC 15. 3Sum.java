class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>> ();
       
        Arrays.sort(nums);
        int idx = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) break;
            int l = i+1;
            int r = nums.length-1;
            while(l<r) {
                int currSum = nums[i] + nums[l] + nums[r];
                if(currSum > 0) r--;
                else if(currSum<0) l++;
                if(currSum==0) {
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l+1 <= r && nums[l] == nums[l+1]) l++;
                    l++;
                    r--;
                }
            }
            while (i+1 < nums.length && nums[i+1] == nums[i]) i++;
        }
        return ans;
    }
}

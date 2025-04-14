class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>> ();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>target && nums[i]>0) break;
            for(int j=i+1;j<nums.length-2;j++) {
                int l = j+1;
                int r = nums.length-1;
                while(l<r) {
                    
                    int currSum = nums[i] + nums[j] + nums[l] + nums[r];
                    if(currSum>target) {
                        r--;
                    }
                    else if(currSum<target) {
                        l++;
                    }
                    else if(currSum==target) {
                        ans.add(Arrays.asList(nums[i], nums[j] , nums[l] , nums[r]));
                        // skiping the duplicates
                        while(l+1 <= r && nums[l]==nums[l+1]) l++;

                        l++;
                        r--;
                    }
                }
                // skip the duplicates if occurs in j count
                while(j+1<nums.length-2 && nums[j]==nums[j+1]) j++;
            }
            // skip the duplicates if first occurs in i count
            while(i+1<nums.length && nums[i] == nums[i+1]) i++;
        }
        return ans;
    }
}

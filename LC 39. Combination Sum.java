class Solution {
    public void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> list) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if (arr[ind] <= target) {
            list.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, list);
            list.remove(list.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, list);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}

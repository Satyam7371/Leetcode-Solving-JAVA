import java.util.*;
class Satyam {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
         for(int i = 0;i<nums.length;i++) {
            int sub = target - nums[i];
       if(mp.containsKey(sub)) {
          return new int[] {i,mp.get(sub)};
                }
           else {
               mp.put(nums[i],i);
                }
            }

        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target  = 6;

            twoSum(nums,target);
            for(int i=0;i<nums.length;i++) {
                System.out.print(nums[i] + " ");
            }

    }
}

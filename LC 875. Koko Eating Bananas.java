class Solution {
     public static int calculateTotalHours(int[] piles, int hourly) {
        int totalH = 0;
        int n = piles.length;
        //find total hours
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(piles[i]) / (double)(hourly));
        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++) {
            max = Math.max(piles[i],max);
        }
        int low = 0;
        int high = max;
        while(low<=high) {
            int mid = (low+high)/2;
            int hr = calculateTotalHours(piles,mid);
            if(hr<=h) {
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}

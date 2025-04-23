class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lr = 0;
        int hr = m - 1;
        while (lr <= hr) {
            int midR = lr + (hr - lr) / 2;
            if (matrix[midR][0] == target) {
                return true;
            }
            if (matrix[midR][0] > target) {
                hr = midR - 1;
            } else {
                lr = midR + 1;
            }
        }
        if (hr >= 0) {
            int lC = 0;
            int hC = n - 1;
            while (lC <= hC) {
                int midC = lC + (hC - lC) / 2;
                if (matrix[hr][midC] == target) {
                    return true;
                }
                if (matrix[hr][midC] > target) {
                    hC = midC - 1;
                } else {
                    lC = midC + 1;
                }
            }
        }
        return false;
    }
}

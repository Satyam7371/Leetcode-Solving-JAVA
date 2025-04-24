class Solution {
    public int findMax(int[][] mat,int m,int n,int col) {
        int max = -1;
        int idx = -1;
        for(int i=0;i<m;i++) {
            if(mat[i][col]>max) {
                max = mat[i][col];
                idx = i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int low = 0;
        int high = n-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            int rowIdx = findMax(mat,m,n,mid);

            int left = mid-1>=0 ? mat[rowIdx][mid-1] : -1;
            int right = mid+1<n ? mat[rowIdx][mid+1] : -1;

            if(mat[rowIdx][mid]>left && mat[rowIdx][mid]>right) {
                return new int[] {rowIdx,mid};
            }
            else if(mat[rowIdx][mid]<left) {
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return new int[] {-1,-1};
    }
}

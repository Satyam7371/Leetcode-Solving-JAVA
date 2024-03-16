class Satyam {
    public int maxArea(int[] height) {
        int n = height.length;
        int s = 0;
        int e = n-1;
        int area  = 0;
        int  maxarea = 0;
        while(s<e) {
            if(height[s]<height[e]) {
                int dist  = e - s;
                area = dist * height[s];
                s++;
            }
            else {
                int dist = e-s;
                area = dist * height[e];
                e--;
            }
            if(area > maxarea) {
                maxarea = area;
            }
        }
        return maxarea;
    }
}

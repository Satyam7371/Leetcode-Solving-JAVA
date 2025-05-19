class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int res = 0;
        int n = s.length();
        // check for space
        int idx = 0;
        while (idx < n && s.charAt(idx) == ' ') {
            idx++;
        }
        // check for sign
        if (idx < n) {
            if (s.charAt(idx) == '-') {
                sign = -1;
                idx++;
            } else if (s.charAt(idx) == '+') {
                idx++;
            }
        }
        // handle over and under flow
        while (idx < n && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE/10 && s.charAt(idx) - '0' > 7) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            // calc res
            res = 10 * res + s.charAt(idx) - '0';
            idx++;

        }
        return sign * res;
    }
}

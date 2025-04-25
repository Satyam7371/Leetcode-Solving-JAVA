class Solution {
    public String reverseWords(String s) {
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int cnt = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                temp.append(ch);
                cnt = 0;
            } else if (cnt == 0) {
                cnt++;
                ans.append(temp.reverse()).append(" ");
                temp.setLength(0);
            }
        }

        //append the last word if left
        if (temp.length() > 0) {
            ans.append(temp.reverse());
        }

        return ans.toString().trim();
    }
}

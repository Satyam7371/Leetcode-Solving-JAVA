class Solution {
    public int lengthOfLastWord(String s) {
        boolean char_flag = false;
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                char_flag = true;
                len++;
            } else {
                if (char_flag == true)
                    return len;
            }
        }
        return len;
    }
}

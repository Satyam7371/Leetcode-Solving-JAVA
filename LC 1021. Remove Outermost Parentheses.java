class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans= new StringBuilder();
        int st = 0;
        int cnt = 0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch=='(') {
                cnt++;
                if(cnt>1) {
                    ans.append(ch);
                }
            }
            else {
                cnt--;
                if(cnt>0) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}

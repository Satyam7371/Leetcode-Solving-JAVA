class Solution {
    public String largestOddNumber(String num) {
        int lastN = num.charAt(num.length()-1) - '0';
        if(lastN%2!=0) {
            return num;
        }
        else {
            for(int i=num.length()-2;i>=0;i--) {
                int numb = num.charAt(i) - '0';
                if(numb%2!=0) {
                    return num.substring(0,i+1);
                }
            }
        }
        return "";
    }
}

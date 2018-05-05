package leetcode.ReverseInteger;

public class Solution {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        String x_string = String.valueOf(x);
        char[] x_chars = x_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = x_chars.length-1;
        while (i > 0){
            if (x_chars[i] == 0){
                if (sb.length() == 0)
                    i--;
                else
                    sb.append(x_chars[i--]);
            }else
                sb.append(x_chars[i--]);
        }
        if (x_chars[0] == '-')
            return Integer.parseInt("-".concat(sb.toString().trim()));
        else{
            long result = Long.parseLong(sb.toString().trim().concat(String.valueOf(x_chars[0])));
            if (result > Integer.MAX_VALUE)
                return 0;
            else
                return (int)result;
        }
    }
}

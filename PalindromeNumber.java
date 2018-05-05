package leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String s = String.valueOf(x);
        char[] target = s.toCharArray();

        if (target.length == 1)
            return true;
        else {
            int start = 0;
            int end = target.length-1;

            while (start <= end){
                if (target[start++] != target[end--])
                    return false;
            }
            if ((start + end) == (target.length-1))
                return true;
            else
                return false;
        }
    }
}


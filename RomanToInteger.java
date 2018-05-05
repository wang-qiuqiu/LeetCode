package leetcode;

import java.util.HashMap;

public class RomanToInteger {
//    private static final HashMap<String,Integer> h = new HashMap<>();
//    public RomanToInteger(){
//        h.put("I",1);
//        h.put("V",5);
//        h.put("X",10);
//        h.put("L",50);
//        h.put("C",100);
//        h.put("D",500);
//        h.put("M",1000);
//    }
    public int romanToInt(String s) {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("I",1);
        h.put("V",5);
        h.put("X",10);
        h.put("L",50);
        h.put("C",100);
        h.put("D",500);
        h.put("M",1000);

        char[] target = s.toCharArray();
        if (target.length == 1)
            return h.get(s);
        int start = 0;
        int end = 1;
        int count = h.get(String.valueOf(target[0]));
        int temp = 0;


        return count;
    }
    public static void main(String[] args){
        RomanToInteger r = new RomanToInteger();
        System.out.println(r.romanToInt("MCMXCIV"));
    }
}

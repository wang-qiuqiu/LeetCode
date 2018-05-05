package leetcode.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            int temp = target - nums[i];
            if (hashMap.containsKey(temp))
                return new int[]{hashMap.get(temp),i};
            hashMap.put(temp,i);
        }
        return null;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{0,4,3,0},0)));
    }
}

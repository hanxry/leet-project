package com.hanxry.l_1480_一维数组动态和;

class Solution {
    public int[] runningSum(int[] nums) {
        // 在原数组上操作,去掉 temp 变量
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (i > 0) {
                nums[i] = current + nums[i - 1];
            }
        }
        return nums;
    }
}
package com.hanxry.l_1672_最富有客户资产总量;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int temp = 0;
        for (int[] account : accounts) {
            int count = 0;
            for (int i : account) {
                count += i;
            }
            temp = Math.max(temp, count);
        }
        return temp;
    }
}
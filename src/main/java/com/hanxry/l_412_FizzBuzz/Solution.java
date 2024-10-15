package com.hanxry.l_412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String tobeAdd = "";
            if (i % 3 == 0) {
                tobeAdd += "Fizz";
            }
            if (i % 5 == 0) {
                tobeAdd += "Buzz";
            }
            if (tobeAdd.isBlank()) {
                res.add(String.valueOf(i));
            } else {
                res.add(tobeAdd);
            }
        }
        return res;
    }
}
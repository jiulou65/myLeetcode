package com.zx.leetcode401_500;

import java.util.*;

public class l414 {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<Integer>(set);
        if (list.size()>2) {
            return list.get(list.size()-3);
        } else {
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,4,3,3};
        int i = new l414().thirdMax(a);
        System.out.println(i);
    }
}

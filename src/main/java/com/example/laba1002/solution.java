package com.example.laba1002;

import java.util.HashMap;
import java.util.Map;

public class solution {

    public static String getMostString(String[] list) {
        int len = list.length;
        Map<String, Integer> map = new HashMap<>();
        for (String k : list) map.put(k, map.getOrDefault(k, 0) + 1);
        int max = 0;
        String maxString = "";
        for (String k : map.keySet()) {
            if (map.get(k) > max) {
                max = map.get(k);
                maxString = k;
            }
        }
        return maxString;
    }

    public static void main(String[] args) {
        String[] ss = new String[]{"aaa", "bbb", "ccc", "ccc", "ddd"};
        System.out.println(getMostString(ss));
    }
}

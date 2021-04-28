package com.company;

import java.util.*;

public class Q1436 {
    public static void main(String[] args) {
        List<String> f1 = Arrays.asList("London", "New York");
        List<String> f2 = Arrays.asList("New York", "Lima");
        List<String> f3 = Arrays.asList("Lima", "Sao Paulo");
        List<List<String>> list = Arrays.asList(f1, f2, f3);

        destCity(list);
    }

    private static String destCity(List<List<String>> paths) {
        String result = "";
        Map<String, String> destanationsMap = new HashMap();

        for (List<String> list : paths) {
            destanationsMap.put(list.get(0), list.get(1));
        }

        for (String value : destanationsMap.values()) {
            if (!destanationsMap.containsKey(value)) {
                result = value;
            }
        }

        return result;
    }
}

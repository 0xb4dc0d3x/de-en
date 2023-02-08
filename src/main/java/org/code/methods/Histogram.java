package org.code.methods;

import java.util.Map;
import java.util.TreeMap;

public class Histogram {
    public String histogram(String text) {
        Map<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++) {
            char new_symbol = text.charAt(i);
            if (treeMap.containsKey(new_symbol)) {
                int count = treeMap.get(new_symbol);
                count++;
                treeMap.put(new_symbol, count);
            } else if (!treeMap.containsKey(new_symbol)) {
                treeMap.put(new_symbol, 1);
            }
        }
        String newText = "";
        for (Map.Entry e : treeMap.entrySet()) {
            newText = newText + e.getKey() + " " + e.getValue() + "\n";
        }
        return newText;
    }
}

package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        Set<String> valueResultMap;

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            String key = entry.getKey();
            int keyLength = key.length();
            if (resultMap.containsKey(keyLength)){
                valueResultMap = resultMap.get(keyLength);
                valueResultMap.add(key);
                resultMap.put(key.length(),valueResultMap);
            } else {
                resultMap.put(key.length(),new HashSet<>(List.of(key)));
            }
        }
        return resultMap;
    }
}

package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)){
                resultList.add(entry.getKey());
            }
        }
        resultList.sort((p1, p2) -> {
            int lengthComparison = Integer.compare(p2.length(), p1.length());
            if (lengthComparison != 0) {
                return lengthComparison; // Sort by length descending
            }
            return p2.compareTo(p1); // Sort alphabetically in reverse order
        });

        return resultList;
    }
}

package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> resultSet = new HashSet<>();
        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            List<String> value = entry.getValue();
            resultSet.addAll(value);
        }
        return resultSet;
    }
}

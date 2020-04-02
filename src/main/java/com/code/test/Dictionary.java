package com.code.test;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Dictionary implements IDictionary {

    Map<String, List<String>> map = new HashMap<String, List<String>>();

    public Dictionary(Set<String> set) {
        this.map = set.stream().collect(Collectors.groupingBy(s->s.charAt(0)+""));
    }

    public List<String> lookup(String firstChar) {

        return map.get(firstChar);
    }
}

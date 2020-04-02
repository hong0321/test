package com.code.test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class DictionaryTest {

    @org.junit.Test
    public void lookup() {

        HashSet<String> set = new HashSet<>();
        set.add("i");
        set.add("like");
        set.add("sam");
        set.add("sung");
        set.add("samsung");
        set.add("mobile");
        set.add("ice");
        set.add("cream");
        set.add("man");
        set.add("go");

        Dictionary dictionary = new Dictionary(set);
        List<String> lookup = dictionary.lookup("c" );

        System.out.println(lookup);
    }
}
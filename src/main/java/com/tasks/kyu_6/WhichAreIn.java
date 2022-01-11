package com.tasks.kyu_6;

import java.util.ArrayList;
import java.util.List;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        for (String word: array1) {
            for (String word2: array2) {
                if(word2.contains(word) && !result.contains(word)){
                    result.add(word);
                    continue;
                }
            }
        }
        return result.toArray(new String[0]);
    }
}

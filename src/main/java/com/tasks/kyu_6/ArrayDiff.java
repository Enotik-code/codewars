package com.tasks.kyu_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//link - https://www.codewars.com/kata/523f5d21c841566fde000009/java

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        if(a.length == 0 || b.length == 0) {
            return a;
        }
        List<Integer> integerList = new ArrayList<>();
        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());

        aList.stream().filter(i -> !bList.contains(i)).forEach(integerList::add);

        return integerList.stream().mapToInt(i -> i).toArray();
    }

}

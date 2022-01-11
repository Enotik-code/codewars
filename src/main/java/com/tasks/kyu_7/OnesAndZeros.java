package com.tasks.kyu_7;

import java.util.List;

//link - https://www.codewars.com/kata/578553c3a1b8d5c40300037c

public class OnesAndZeros {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        String binaryInString =  binary.stream().map(Object::toString).reduce("", (a, b) -> a + b);
        return Integer.parseInt(binaryInString, 2);
        // Your Code
    }
}

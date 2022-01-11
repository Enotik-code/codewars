package com.tasks.kyu_6;

//link - https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java

import java.util.Arrays;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        String binary = Arrays.stream(numbers).mapToObj(String::valueOf).reduce("", (a, b) -> a + b);
        return String.format("(%s) %s-%s", binary.substring(0, 3), binary.substring(3, 6), binary.substring(6));
    }

}

package com.tasks.kyu_6;

import com.tasks.kyu_6.ArrayDiff;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDiffTest {

    private static int[] solution(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }

    @Test
    void arrayDiff() {
        assertArrayEquals(new int[] {2}, ArrayDiff.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, ArrayDiff.arrayDiff(new int [] {}, new int[] {1,2}));
    }

    @Test
    void arrayDiff2(){
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            int[] arr1 = IntStream.range(0, rnd.nextInt(100)).map(x -> rnd.nextInt(25)).toArray();
            int[] arr2 = IntStream.range(0, rnd.nextInt(100)).map(x -> rnd.nextInt(25)).toArray();

            int[] expected = solution(arr1, arr2);
            int[] actual = ArrayDiff.arrayDiff(arr1, arr2);

            assertArrayEquals(expected, actual);
        }
    }
}
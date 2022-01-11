package com.tasks.kyu_7;

//link - https://www.codewars.com/kata/5a7778790136a132a00000c1

public class SingleDigit {

    static int singleDigit(int n) {
        if (n < 10) {
            return n;
        }
        String result = Integer.toBinaryString(n);
        int sum = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '1')
                sum += 1;
        }
        return singleDigit(sum);
    }

}

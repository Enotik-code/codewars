package com.tasks.kyu_7;

//link - https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

import java.util.Locale;

public class XO {

    public static boolean getXO (String str) {
        final char x = 'x';
        final char o = 'o';

        String result = str.toLowerCase(Locale.ROOT);

        int amountOfX = 0;
        int amountOfO = 0;

        for (int i = 0; i < result.length(); i++) {
            if(result.toCharArray()[i] == x)
                amountOfX++;
            if (result.toCharArray()[i] == o)
                amountOfO++;
        }
        return amountOfO == amountOfX;
    }

}

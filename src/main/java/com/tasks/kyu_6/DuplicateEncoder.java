package com.tasks.kyu_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//link - https://www.codewars.com/kata/54b42f9314d9229fd6000d9c

public class DuplicateEncoder {

    static String encode(String word){
        String wordToLowerCase = word.toLowerCase(Locale.ENGLISH);
        List<String> duplicateLetters = new ArrayList<>();

        for (int i = 0; i < wordToLowerCase.length(); i++) {
            String letter = String.valueOf(wordToLowerCase.charAt(i));
            if (wordToLowerCase.indexOf(letter, i + 1) != -1) {
                duplicateLetters.add(letter);
            }
        }
        StringBuilder encodedWord = new StringBuilder(wordToLowerCase);

        for (int i = 0; i < wordToLowerCase.length(); i++) {
            if (duplicateLetters.contains(String.valueOf(wordToLowerCase.charAt(i)))) {
                encodedWord.setCharAt(i, ')');
            }else{
                encodedWord.setCharAt(i, '(');
            }
        }

        return encodedWord.toString();
    }
}

package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Let,s go.");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text1 = poemBeautifier.beautify("The first text", (a -> "ABC" + a + "ABC"));
        String text2 = poemBeautifier.beautify("The second text", (a -> a.toUpperCase()));
        String text3 = poemBeautifier.beautify("The third text", (a -> a.toLowerCase()));
        String text4 = poemBeautifier.beautify("The fourth text", (a -> a.substring(0, 10).toUpperCase()));
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

    }
}


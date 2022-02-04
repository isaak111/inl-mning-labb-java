package com.Uppgift3;

import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[aeiouy].*[aeiouy]", Pattern.CASE_INSENSITIVE);

        List.of("Malin", "båt", "bil", "Flygplan", "ravioli", "")
                .stream()
                .filter(word -> pattern.matcher(word).find())
                .forEach(System.out::println);







    }
}

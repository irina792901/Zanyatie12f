package org.example;

public class StringUtils {
    public static String concatenate(String a, String b) {
        if (a == null || b == null) {
            return null;
        }
        return a + b;
    }
}
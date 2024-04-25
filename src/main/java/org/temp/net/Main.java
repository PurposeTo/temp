package org.temp.net;

import static java.lang.StringTemplate.STR;

public class Main {
    private static final String NAME = "world";

    public static void main(String[] args) {
        System.out.println(STR."Hello \{NAME}!");
    }
}

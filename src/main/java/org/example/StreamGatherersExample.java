package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGatherersExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("C", "Java", "Python", "Rust");
        String result = stream.collect(Collectors.collectingAndThen(
                Collectors.joining(", "),
                s -> "Languages: " + s
        ));
        System.out.println(result); // Languages: C, Java, Python, Rust
    }
}

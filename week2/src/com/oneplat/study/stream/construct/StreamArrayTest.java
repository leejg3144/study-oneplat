package com.oneplat.study.stream.construct;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamArrayTest {

    public static void main(String[] args) {
        String[] arr = new String[]{"a","b","c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        streamOfArrayPart.forEach(
                e-> { System.out.println(e); }
        );
    }

}

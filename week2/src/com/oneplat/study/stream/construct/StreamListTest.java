package com.oneplat.study.stream.construct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamListTest {

    static void ListStream() {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();
        Stream<String> parallelStream = list.parallelStream(); // 병렬 처리 스트림

        //Stream<String> streamOf = streamOf(list);
    }

    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty()
                ? Stream.empty()
                : list.stream();
    }

    public void buildStream() {
        Stream<String> builderStream =
                Stream.<String>builder()
                        .add("Eric").add("Elena").add("Java")
                        .build();
    }

    public void generateStream(int size) {
        Stream<String> generatedStream =
                Stream.generate(() -> "gen").limit(size);
    }

    public void iterateStream(int seed, int size) {
        Stream<Integer> iteratedStream =
                Stream.iterate(seed, n -> n + 2).limit(size);
    }
}

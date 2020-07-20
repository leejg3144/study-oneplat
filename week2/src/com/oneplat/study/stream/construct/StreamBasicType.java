package com.oneplat.study.stream.construct;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamBasicType {

    public IntStream makeIntStream() {
        return IntStream.range(1, 10);
    }

    public Stream<Integer> makeBoxIntStream() {
        return IntStream.range(1,5).boxed();
    }

    public LongStream makeLongStream() {
        return LongStream.range(1,5);
    }

    public DoubleStream makeDoubleStream() {
        return new Random().doubles(3);
    }

    public IntStream makeCharStream() {
        return "Stream".chars();
    }

    public static Stream<String> makeStringStream() {
        return Pattern.compile(", ").splitAsStream("Eric, Elena, Java");
    }

    public static Stream<String> makeFileStream() throws IOException {
        return Files.lines(Paths.get("file.txt"),
                Charset.forName("UTF-8"));
    }

    /****
     * 병렬 스트림 생성
     * @return Stream<String>
     */
    public static Stream<String> makeParallelStream() {
        List<String> list = new ArrayList<>();

        return list.parallelStream();
    }

    /***
     * 병렬 스트림 여부 확인
     * @param stream
     * @return boolean
     */
    public static boolean isParallelStream(Stream<String> stream) {
        // sequential() = 직렬스트림
        return stream.isParallel();
    }


    public static Stream<String> concatStream() {
        Stream<String> stream1 = Stream.of("Java", "Scala", "Groovy");
        Stream<String> stream2 = Stream.of("Python", "Go", "Swift");
        //Stream<String> stream2 = Stream.empty();
        return Stream.concat(stream1, stream2);
    }
}


package com.oneplat.study.stream.processing;

import com.oneplat.study.stream.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamProcessingTest {

    final List<String> names = Arrays.asList("Eric", "Elena", "Java");

    final List<Product> products = Arrays.asList(new Product(100, 10, "productA")
            , new Product(200, 20, "productB")
            , new Product(300, 30, "productC")
            , new Product(400, 40, "productD"));

    final List<List<String>> listFlat = Arrays.asList(Arrays.asList("a")
                                                , Arrays.asList("b")
                                                , Arrays.asList("c"));

    public Stream<String> streamFilterTest1() {
        Stream<String> stream =
                names.stream()
                        .filter(name -> name.contains("a"));
        return stream;
    }

    public Stream<String> streamMappingTest() {
        Stream<String> stream =
                names.stream()
                .map(String::toUpperCase);

        return stream;
    }

    public Stream<Integer> streamMappingTest2() {
        Stream<Integer> stream =
                products.stream()
                .map(Product::getAmount);

        return stream;
    }

    public List<String> streamFlatMap() {
        List<String> flatList = listFlat.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        return flatList;
    }

    public void objectFlatMap() {
        products.stream()
                .flatMapToInt(
                        product -> IntStream.of(product.getAmount()
                        ,product.getPrice()))
                .average().ifPresent(avg -> System.out.println(Math.round(avg * 10) / 10.0));
    }

    public List<Integer> sortIntStream() {
        return IntStream.of(10,20,30,40,50)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }
}

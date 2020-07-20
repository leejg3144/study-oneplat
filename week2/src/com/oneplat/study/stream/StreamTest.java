package com.oneplat.study.stream;

import com.oneplat.study.stream.processing.StreamProcessingTest;

public class StreamTest {

    public static void main(String[] args){
        StreamProcessingTest test = new StreamProcessingTest();

        test.sortIntStream().toString();
    }
}

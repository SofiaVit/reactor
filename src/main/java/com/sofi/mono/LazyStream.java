package com.sofi.mono;

import java.util.stream.Stream;

public class LazyStream {


    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(1).map( num -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return num*2;
        });
        //System.out.println(stream);
        stream.forEach(System.out::println);
    }
}

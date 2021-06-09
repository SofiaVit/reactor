package com.sofi.mono;

import reactor.core.publisher.Mono;

public class MonoSubscribe {

    public static void main(String[] args){
        Integer number = null;
        Mono<Integer> mono = Mono.just(1)
                .map(num -> num*2)
                .map(num -> num / number);

        mono.subscribe(item -> System.out.println(item), err-> System.out.println(err.getMessage()), ()->System.out.println("Completed"));

    }
}

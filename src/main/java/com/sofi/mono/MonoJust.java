package com.sofi.mono;

import reactor.core.publisher.Mono;

public class MonoJust {

    public static void main(String[] args){

        Mono<Integer> mono = Mono.just(1);

        System.out.println(mono);

        mono.subscribe(num->System.out.println("Received: " + num));

    }
}

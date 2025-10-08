package com.learning.StreamApiPrograms;


import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .parallel()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " : " + n));
    }
}


/*
 * output
 * 
 * ForkJoinPool.commonPool-worker-3 : 2 ForkJoinPool.commonPool-worker-3 : 9
 * ForkJoinPool.commonPool-worker-7 : 1 ForkJoinPool.commonPool-worker-5 : 4
 * main : 6 ForkJoinPool.commonPool-worker-4 : 5
 * ForkJoinPool.commonPool-worker-6 : 7 ForkJoinPool.commonPool-worker-1 : 3
 * ForkJoinPool.commonPool-worker-2 : 8
 */
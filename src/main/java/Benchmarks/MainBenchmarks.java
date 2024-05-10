package Benchmarks;

import org.example.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MainBenchmarks {
    @Benchmark
    public void test_sum10(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 10; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_sum100(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_sum1000(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_sum10000(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 10000; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_mult10(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 10; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._mult(arr);
    }
    @Benchmark
    public void test_mult100(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._mult(arr);
    }
    @Benchmark
    public void test_mult1000(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._mult(arr);
    }
    @Benchmark
    public void test_mult10000(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 10000; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._mult(arr);
    }
    @Benchmark
    public void test_min10(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 10; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._min(arr);
    }
    @Benchmark
    public void test_min100(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._min(arr);
    }
    @Benchmark
    public void test_min1000(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._min(arr);
    }
    @Benchmark
    public void test_min10000(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 10000; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._min(arr);
    }
    @Benchmark
    public void test_max10(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 10; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._max(arr);
    }
    @Benchmark
    public void test_max100(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._max(arr);
    }
    @Benchmark
    public void test_max1000(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._max(arr);
    }
    @Benchmark
    public void test_max10000(){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < 10000; i++) {
            Random random = new Random();
            long randomNumber = random.nextLong() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._max(arr);
    }
    public static void main(String[] args) {
        Options opt = new OptionsBuilder()
                .include(org.example.Main.class.getSimpleName())
                .warmupTime(TimeValue.seconds(2))
                .measurementTime(TimeValue.seconds(2))
                .warmupIterations(3)
                .measurementIterations(3)
                .forks(1)
                .build();

        try {
            Runner runner = new Runner(opt);
            Collection<RunResult> result =  runner.run();
        } catch (Exception e) {}
    }
}

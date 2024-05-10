package Benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.Collection;

public class MainBenchmarks {
    @Benchmark
    public void mybenchmark(){
        int a = 2;
        int b = 3;
        int c = a + b;
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

package kr.easw.lesson06;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class LambdaExample {
    private static final Random RANDOM = new Random();

    private static final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static final Supplier<Integer> numberSupplier = () -> numbers[RANDOM.nextInt(numbers.length)];

    private static final Function<Integer, Integer> negativeConverter = (number) -> -number;

    @SuppressWarnings({"Convert2MethodRef", "RedundantSuppression"})
    private static final Consumer<Integer> printer = (number) -> {
        System.out.println(number);
    };

    private static final BiFunction<Integer, Integer, Integer> adjuster = (number, adjustment) -> number + adjustment;


    public static void main(String[] args) {
        int first = numberSupplier.get();
        int second = numberSupplier.get();
        int example = exampleResult(first, second);
        int lambda = lambdaResult(first, second);
        if (example == lambda) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("오답입니다!");
        }
    }

    private static int exampleResult(int base, int delta) {
        int negative = -delta;
        int adjusted = base + delta;
        System.out.println(negative);
        return adjusted;
    }

    private static int lambdaResult(int base, int delta) {
        int adjusted = adjuster.apply(base, delta);
        printer.accept(negativeConverter.apply(delta));
        return adjusted;
    }

}

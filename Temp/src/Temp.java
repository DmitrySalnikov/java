import com.sun.org.apache.xpath.internal.functions.FuncBoolean;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Temp {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(
                seed,
                n -> {
                    String t = new Integer((int)Math.pow(n, 2)).toString();
                    int l = t.length();
                    if (l < 2)
                        return 0;
                    if (l  == 2)
                        return (int)Integer.parseInt(t.substring(l - 2, l - 1));
                    if (l == 3)
                        return (int)Integer.parseInt(t.substring(l - 3, l - 1));
                    return (int)Integer.parseInt(t.substring(l - 4, l - 1));
                }
        );
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        T[] a = (T[]) stream.sorted(order).toArray();
        if (a.length == 0) {
            minMaxConsumer.accept(null, null);
            return;
        }
        minMaxConsumer.accept(a[0], a[a.length - 1]);
    }

    public static void main(String[] args) {

    }
}

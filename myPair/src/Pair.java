import java.util.NoSuchElementException;
import java.util.Objects;

class Pair<T, U> {
    private T a;
    private U b;

    private Pair(T x, U y) { a = x; b = y; }
    public T getFirst() { return a; }
    public U getSecond() { return b; }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (a != null ? !a.equals(pair.a) : pair.a != null) return false;
        return !(b != null ? !b.equals(pair.b) : pair.b != null);
    }
    public int hashCode() {
        int t = 0;
        if (a != null)
            t += a.hashCode();
        return (b != null ? t + b.hashCode() : t);
    }
    public static <T, U> Pair<T, U> of(T x, U y) { return new Pair<T, U>(x, y); }
}

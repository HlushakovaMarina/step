package L14_04_2025.predicate;

import java.util.function.Predicate;

@FunctionalInterface
public interface ApplePredicate<T> {
    boolean test(T t);
}

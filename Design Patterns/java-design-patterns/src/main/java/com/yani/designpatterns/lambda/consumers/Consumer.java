package com.yani.designpatterns.lambda.consumers;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
    default Consumer<T> andThen(Consumer<T> other) {
        Objects.requireNonNull(other);

        return (T t) -> {
            this.accept(t);
            other.accept(t);
        };
    }
}

package io.github.m;

@FunctionalInterface
public interface QuadFunction<T, U, X, N, R> {
    R apply(T t, U u, X x, N n);
}

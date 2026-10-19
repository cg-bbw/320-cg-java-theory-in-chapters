package ch.bbw.cge._90_generics;

// T is a type parameter. The same Box implementation can work with different reference types.
public class Box<T> {

    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

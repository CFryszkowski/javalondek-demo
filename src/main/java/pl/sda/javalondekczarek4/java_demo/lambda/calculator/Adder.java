package pl.sda.javalondekczarek4.java_demo.lambda.calculator;

@FunctionalInterface
public interface Adder<T> {
    T add (T first, T second);
}

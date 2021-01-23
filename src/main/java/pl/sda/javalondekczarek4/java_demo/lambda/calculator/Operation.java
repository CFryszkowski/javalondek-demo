package pl.sda.javalondekczarek4.java_demo.lambda.calculator;

public interface Operation<T> {
    
    T operation (T first, T second);
}

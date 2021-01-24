package pl.sda.javalondekczarek4.java_demo.optional.java8;

import java.util.Optional;

public class GraphicsCard {

    private String model;

    public GraphicsCard(String modej) {
        this.model = modej;
    }

    public Optional<String> getModel() {
        return Optional.ofNullable(model);
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "modej='" + model + '\'' +
                '}';
    }
}

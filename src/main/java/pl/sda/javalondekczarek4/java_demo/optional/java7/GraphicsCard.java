package pl.sda.javalondekczarek4.java_demo.optional.java7;

public class GraphicsCard {

    private String model;

    public GraphicsCard(String modej) {
        this.model = modej;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "modej='" + model + '\'' +
                '}';
    }
}

package pl.sda.javalondekczarek4.java_demo.lambda;

public class WorkLifeBalanceImplementation implements WorkLifeBalance{
    @Override
    public void hardWork() {
        System.out.println("Work");
    }

    @Override
    public void sleep(int time) {
        System.out.println("Sleep");
    }
}

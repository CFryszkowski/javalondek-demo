package pl.sda.javalondekczarek4.java_demo.lambda;

public class CzarekRunner implements Runner{
    @Override
    public void go(int speed) {
        System.out.println("Czarek speed is"+speed);
    }

    @Override
    public void go() {
        System.out.println("Run Czarek, run");
    }

    public void  walk(){
        System.out.println("walk czarek...");
    }
}

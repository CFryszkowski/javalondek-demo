package pl.sda.javalondekczarek4.java_demo.lambda;

public class StaticDemo {

    public static void demo(){
        System.out.println("static demo");
    }

    public void crash(){
        System.out.println("no to bym:)");
    }

    public static void main(String[] args) {

        demo();
        StaticDemo.demo();

        StaticDemo empty = null;

        empty.demo();
        empty.crash();
    }
}

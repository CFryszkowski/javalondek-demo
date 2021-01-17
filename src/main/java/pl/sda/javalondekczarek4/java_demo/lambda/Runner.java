package pl.sda.javalondekczarek4.java_demo.lambda;


@FunctionalInterface
public interface Runner {

    void go();
    default void go(int speed){
        System.out.println("My current speed"+ speed);
    }
    static void walk(){
        System.out.println("static walk method");
    }

}

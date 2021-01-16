package pl.sda.javalondekczarek4.java_demo.lambda;

public class HelloLambda {

    public static void main(String[] args) {
        CzarekRunner czarekRunner= new CzarekRunner();
        czarekRunner.walk();
        Runner runner = new CzarekRunner();
        runner.go();
//        runner.walk(); - doesn't compile

        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Anoymous runner");
            }
        };
        anonymousRunner.go();
    }

}

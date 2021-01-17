package pl.sda.javalondekczarek4.java_demo.lambda;

public class HelloLambda {

    public static void main(String[] args) {
        CzarekRunner czarekRunner = new CzarekRunner();
        czarekRunner.walk();
        Runner runner = new CzarekRunner();
//        runner.go();
        handleRunner(runner);
//        runner.walk(); - doesn't compile

        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Anoymous runner");
            }
        };
//        anonymousRunner.go();
        handleRunner(anonymousRunner);

        // call handleRunner user anonymous class

        handleRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("inside method call");
            }
        });

        //using lambda- super happy

        handleRunner(() -> System.out.println("inside lambda call"));

        Runner myFirstLambda = () -> {
        };

        Runner mySecondLambda = () -> {

            System.out.println("Inside my second lambda");
        };

        Runner myThirdLambda = () -> System.out.println("my third lambda");

        Runner myFourthLambda = () -> {
            System.out.println("my first text");
            System.out.println("my second text");
        };

        myFourthLambda.go();
        myFourthLambda.go(30);
        Runner.walk();

    }


    public static void handleRunner(Runner anyRunner) {
        System.out.println("calling hendleRunner");

        anyRunner.go();
    }

}

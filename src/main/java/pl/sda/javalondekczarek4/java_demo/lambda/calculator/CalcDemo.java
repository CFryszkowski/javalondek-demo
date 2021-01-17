package pl.sda.javalondekczarek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");

        Adder adder = (int a, int b) -> {
            return a+b;
        } ;

        Adder adder2 =(first,second)->{
//            first.length();- wrong type
            return  first+second;
        };

        Adder adder3 = (first,second)-> first+second;


        StrangeOne strangeOne = (int a, int b) -> {
            return a+b;
        } ;

        StringAdder stringAdder = (one,two)->{
            return one.concat(two);
        };

        MyAdder myAdder = (a, b, comment) -> {
            System.out.println(comment);
            return a + b;
        };
        Substruction substruction = (a,b)-> a-b;
        Multi multi = (a,b)-> a*b;
        Division division = (a,b)-> a/b;


        substruction.sub(5,3);

        myAdder.addWithComment(5,10,"should be 15");
    }
}

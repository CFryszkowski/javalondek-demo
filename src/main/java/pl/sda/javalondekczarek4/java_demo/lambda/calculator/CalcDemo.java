package pl.sda.javalondekczarek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");

        Adder<Integer> adder = (Integer a, Integer b) -> {
            return a+b;
        } ;

        Adder<Integer> adder2 =(first,second)->{
//            first.length();- wrong type
            return  first+second;
        };

        Adder<Integer> adder3 = (first,second)-> first+second;


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

        Substruction<Integer> substruction = (a,b)-> a-b;
        Multi<Integer> multi = (a,b)->  a*b;
        Division<Double> division = (a,b)-> a/b;


        myAdder.addWithComment(5,10,"should be 15");
        System.out.println( substruction.sub(5,3));
        System.out.println(multi.multi(5,3));
        System.out.println(division.div(10.0,2.0));

        Operation<Double> divisionOperation =(first, second) -> first/second;
    }
}

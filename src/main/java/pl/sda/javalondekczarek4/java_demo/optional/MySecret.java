package pl.sda.javalondekczarek4.java_demo.optional;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class MySecret <T>{
    private T secret;

    @Override
    public String toString() {
        return "MySecret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public T getSecret() {
        return secret;
    }

    public void setSecret(T secret) {
        this.secret = secret;
    }

    public MySecret(T secret) {
        this.secret = secret;
    }

    public static void main(String[] args) {
        MySecret<String> realOne = new MySecret<>("bla bla bla bla bla bla bla bla bla bla bla bla bla");
        MySecret<String> withNullContent = new MySecret<>(null);
        printSecretLength(realOne);
        printSecretLength(withNullContent);

        MySecret<Integer> secretNumber= new MySecret<>(42);
        MySecret<Integer> secretNullNumber = new MySecret<>(null);
        var secretNumOne = secretNumber.getSecret();
        var secretnull = secretNullNumber.getSecret();

        Optional<Integer>optionalNumb = Optional.of(42);
        Optional<Integer>optionalNull = Optional.empty();
        Optional<Integer>optionalNull2 = Optional.ofNullable(null);

    }

    public static void printSecretLength(MySecret<String> mySecret){
        int secretLen = mySecret.getSecret()!=null? mySecret.getSecret().length() : 0;
         secretLen = nonNull( mySecret.getSecret())? mySecret.getSecret().length() : 0;
//        if (mySecret.getSecret() != null){
//            secretLen = mySecret.getSecret().length();
//        }else {
//            secretLen = 0;
//        }
        System.out.println("My secret has " + secretLen + " characters");
    }

    public static <T> void processSecret(T optional){

        Optional<T> opt = Optional.ofNullable(optional);
        int nuber =4;
        Optional<Integer>numerInsideOptional = Optional.of(nuber);

//        T unpacked = opt.get(); - dont do it!!!!

        T unpacked;
        if (opt.isPresent()){
            unpacked = opt.get();
        }else {
            unpacked = null;
        }

        unpacked=opt.orElse(null);
        unpacked= (T) opt.or(()-> null);

        Optional<String> string = Optional.empty();
        Optional<String> fromOptional = string.or(()->Optional.of("no value"));
    }
}

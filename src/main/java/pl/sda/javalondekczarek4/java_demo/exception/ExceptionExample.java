package pl.sda.javalondekczarek4.java_demo.exception;

public class ExceptionExample {

    public static void main(String[] args)
        //    throws NoNickException dont do it
    {
       ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
       String myNick;
      try {
          myNick=exceptionGenerator.nick();
      }catch ( NoNickException e){
          System.out.println("Problem with nick generator...");
          myNick = "this user has no nick";
      }
        System.out.println("My nick is: "+ myNick);

//      String nullString= null;
//        nullString.concat("ma kota");

        System.out.println("here???");
    }
}

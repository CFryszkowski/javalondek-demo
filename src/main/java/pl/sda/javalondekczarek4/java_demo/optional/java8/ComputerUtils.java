package pl.sda.javalondekczarek4.java_demo.optional.java8;

public class ComputerUtils {
    private ComputerUtils() {
        throw new UnsupportedOperationException("This class shouldn't be instantiated!!!");
    }

    public static String getGraphicCardModelGoodApproach(Computer computer) {
        return null;

    }
        public static void main (String[]args){
            Computer withoutGraphicsCard = new Computer(null);
            Computer withUnknownModel = new Computer(new GraphicsCard(null));
            Computer personalComputer = new Computer(new GraphicsCard("nVidia RTX 380"));

            getGraphicCardModelGoodApproach(withoutGraphicsCard);
            getGraphicCardModelGoodApproach(withUnknownModel);
            getGraphicCardModelGoodApproach(personalComputer);
        }
    }
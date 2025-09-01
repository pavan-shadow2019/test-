import java.util.Random;

public class Randomizer{
    public static void main(String[] args){
        Random rc = new Random();
        
        int magicJiggler;
        double hiddenNumber;

        magicJiggler = rc.nextInt(1, 99);
        hiddenNumber = rc.nextDouble(1, 6);
        System.out.println(magicJiggler);
        System.out.println("The hidden number is " + hiddenNumber);
    }
}


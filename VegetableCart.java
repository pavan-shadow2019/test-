import java.util.Scanner;

public class VegetableCart{
    public static void main(String[] args){
        
        int price;
        double quantity;
        String item;
        double total;

        Scanner vc = new Scanner(System.in);
        
        System.out.print("What is the name of the item: ");
        item = vc.nextLine();
        System.out.print("What is the price of the item: ");
        price = vc.nextInt();
        System.out.print("What is the quantity of the item: ");
        quantity = vc.nextDouble();

        total = quantity * price;

        System.out.println("You have purchased " + quantity +" kg " + item );
        System.out.print("Your total is Rs." + total );







        vc.close();
    }
}
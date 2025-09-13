import java.util.Scanner;

public class Eswitcher {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose any one day of the week: ");
        String day= sc.nextLine();

        switch(day){

            case "Monday", "Tuesday", "Wednesday", "Thursady", "Friday" -> 
            System.out.println("Today is a weekday🥲");
            case "Saturday", "Sunday" -> 
            System.out.println("Today is a weekend😎");
            default -> System.out.println(day + " is not a day");
                }


        sc.close();
    }
}

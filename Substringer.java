import java.util.Scanner;

public class Substringer {
    public static void main(String[] args){
        String email;

        Scanner sc = new Scanner (System.in);
        

        System.out.println("Please enter your email: ");
        email = sc.nextLine();

        System.out.println(email.substring(0, email.indexOf("@")));


        sc.close();
    } 
}

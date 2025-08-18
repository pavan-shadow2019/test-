import java.util.Scanner; /*util is the package to reading keyboard inputs */

public class readingkeyboard{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Enter the First Number: ");
        a= s.nextInt();
        
        System.out.print("Enter the Second Number: ");
        b = s.nextInt();
        /* Multipication*/
        c = a *b;
        System.out.println("Mulipication Total is " + c);

        s.close();
    }
}
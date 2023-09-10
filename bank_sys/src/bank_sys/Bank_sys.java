package bank_sys;
import java.util.Scanner;
public class Bank_sys {

    public static void main(String[] s) {
        try {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string value: ");
         String str = sc.next();
         Double doub = Double.parseDouble(str);
         System.out.println("Value of the variable: "+doub);
      }catch (NumberFormatException ex) {
         System.out.println("Given String is not parsable to double");
      }
    }
    
}

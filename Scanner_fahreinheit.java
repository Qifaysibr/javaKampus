import java.util.Scanner;

public class Scanner_fahreinheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int celcius, fahreinheit;
        
        System.out.print("Suhu dalam derajat celcius: ");
        celcius = input.nextInt();

        
        fahreinheit = (9/5)*celcius+32;

        System.out.println("Maka, suhu dalam derajat fahreinheit: " + fahreinheit);
    }
}

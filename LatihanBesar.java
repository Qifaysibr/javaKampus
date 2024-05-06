import java.util.Scanner;

public class LatihanBesar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Input jari-jari bola: ");
        double r = s.nextDouble();
        
        double volume = (4.0/3.0) * 0.14 * (r * r * r);
        
        System.out.println("Volume bola adalah: " + volume);
    }
}

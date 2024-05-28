import java.util.Scanner;
/**
 * ForLoop
 */
public class ForLoop {

    public static void main(String[] zx) {
        int a;
        Scanner oke = new Scanner(System.in);
        System.out.print("Masukkan nilai pilihan anda : ");
        a=oke.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println(i);
            System.out.println();
        }
    }
}
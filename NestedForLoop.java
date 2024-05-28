import java.util.Scanner;
public class NestedForLoop {
    public static void main(String[] args) {
        int a;
        Scanner oke = new Scanner(System.in);
        System.out.print("Masukkan nilai pilihan anda : ");
        a = oke.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}

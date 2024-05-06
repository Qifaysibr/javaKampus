import java.util.Scanner;

public class Scanner_segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tinggi, alas, luas;
        
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = input.nextInt();

        System.out.print("Masukkan alas segitiga: ");
        alas = input.nextInt();

        
        luas = tinggi * alas / 2;

        System.out.println("Luas Segitiga: " + luas);
    }
}

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int panjang, lebar, luas, keliling;
        
        System.out.print("Masukkan panjang persegi panjang: ");
        panjang = s.nextInt();

        System.out.print("Masukkan lebar persegi panjang: ");
        lebar = s.nextInt();

        // Menghitung luas persegi panjang
        luas = panjang * lebar;

        // Menghitung keliling persegi panjang
        keliling = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}

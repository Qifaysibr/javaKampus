import java.util.Scanner;

public class LatihanBesar2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Input angka pertama: ");
        int a1 = s.nextInt();

        System.out.print("Input angka kedua: ");
        int a2 = s.nextInt();
        
        int jumlah;
        if(a1 == a2) {
         jumlah = a1 + a2 ;
    } else {
         jumlah =  a1 * a2 ;
    };
        System.out.println("Output nya adalah: " + jumlah);
    }
}

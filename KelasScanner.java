import java.util.Scanner;

public class KelasScanner{
    public static void main(String[]args) {
        //variabel
        String nama;
        int umur;
        double tinggi;
        
        //instansi class Scanner
        Scanner s = new Scanner(System.in);
        
        //proses inputan
        System.out.print("\nMasukkan nama: "); nama = s.nextLine();
        System.out.print("\nMasukkan umur: "); umur = s.nextInt();
        System.out.print("\nMasukkan tinggi: "); tinggi = s.nextDouble();
        
        //output 
        System.out.print("\nNama : "+nama);
        System.out.print("\nUmur : "+umur);
        System.out.print("\nTinggi : "+tinggi);
        
        
    }
}
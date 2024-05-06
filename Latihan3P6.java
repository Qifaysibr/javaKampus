import java.util.Scanner;

public class Latihan3P6{
    public static void main(String[] args) {
        System.out.print("Masukan usia anda = ");
        Scanner bacaInput = new Scanner(System.in);
        String kategori;
        int umur = bacaInput.nextInt(); 
        
        if (umur <= 16){
            kategori = "Anak-anak";
        } else if (umur <= 25) {
            kategori = "Remaja";
        } else {
            kategori = "Dewasa";
        } 
        System.out.println("Kategori Usia anda adalah = " + kategori );
    }
}


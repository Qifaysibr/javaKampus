import java.util.Scanner;

public class Iseng{
    public static void main(String[] args) {
        System.out.print("Masukan urutan hari yang diinginkan = ");
        Scanner bacaInput = new Scanner(System.in);
        String namaHari;
        int hari = bacaInput.nextInt(); 
        
        if (hari == 1){
            namaHari = "Senin";
        } else if (hari == 2) {
            namaHari = "Selasa";
        } else if (hari == 3) {
            namaHari = "Rabu";
        } else if (hari == 4) {
            namaHari = "Kamis";
        } else if (hari == 5) {
            namaHari = "Jumat";
        } else if (hari == 6) {
            namaHari = "Sabtu";
        } else {
            namaHari = "Ahad";
        }
        System.out.println("Nama Hari = " + namaHari);
    }
}


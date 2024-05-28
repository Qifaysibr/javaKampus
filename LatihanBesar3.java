import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LatihanBesar3 {
    public static void main(String[] args) throws Exception {//throw exception berfungsi untuk menangkap error//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String customer;
        int jarak, diskon, total;
        
        System.out.println("Masukan Nama Customer: ");
        customer = br.readLine();
        System.out.println("Masukan jarak yang ditempuh: ");
        jarak = Integer.parseInt(br.readLine());
        
        int biayaPertama = 9500;
        int biayaPerKm = 2500;
        total = biayaPertama;
        if (jarak > 4) {
            total += (jarak - 4)*biayaPerKm;
        }
        
        
        if (jarak <= 10) {
            diskon = 0;
        } else if (jarak <= 15) {
            diskon = 2000;
        } else {
            diskon = 5000;
        }
        
        total -= diskon;
        
        
        System.out.println("Nama Customer: " + customer);
        System.out.println("Jarak yang akan ditempuh: " + jarak);
        System.out.println("Anda dapat dsikon sebesar: " + diskon);
        System.out.println("total: " + total);
        
    
    }
}

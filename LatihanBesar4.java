import java.io.*;

    public class LatihanBesar4{
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Masukan jenis kamar hotel yang anda inginkan");
            String jenis = br.readLine();
            
            System.out.println("Masukan berapa lama sewa");
            int hari = Integer.parseInt(br.readLine());
            
            int tarif = 0;
            if (jenis.equals("standard")) {
                if (hari <= 2) {
                    tarif = 400000;
                } else {
                    tarif = 350000;
                }
                
            } else if(jenis.equals("eksekutif")) {
                   if (hari <= 2) {
                    tarif = 1200000;
                } else {
                    tarif = 1000000;
                } 
                }
                
            int total = hari * tarif;
            
            System.out.println("Total tarif yang harus dibayarkan adlaah: Rp."+total);
            
            
        }
    }
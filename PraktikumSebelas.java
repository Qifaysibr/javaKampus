import java.util.Scanner;
public class PraktikumSebelas{
    public static void main(String[] args){
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Masukan Suatu Angka =");
        long angka = bacaInput.nextLong();
        if (angka % 2 == 0){
            System.out.println(angka + " adalah angka Genap");
        } else {
            System.out.println(angka + " adalah angka ganjil");
        }   
    }
}
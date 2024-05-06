//memanggil keias Scanner dari paket java. util
import java.util.Scanner;
public class PraktikumSepuluh{
public static void main (String[] args) {
Scanner bacalnput = new Scanner(System.in);
System.out.print("Masukan Suatu Angka =");
int angka = bacalnput.nextInt();
if (angka % 2 == 0)
    System.out. println("Keiipatan Dua") ;
if (angka % 5 == 0){
    System.out.println("Keiipatan Lima") ;
    System.out.println("Statement Lain") ;
}
System. out. println("Terimakasih") ;
}
}
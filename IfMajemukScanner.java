import java.util.Scanner; 
 class IfMajemukScanner { 
	public static void main(String[]args){ 
	int nilai ; 
	Scanner s = new Scanner (System.in); 
	System.out.print(" masukan nilai "); 
		nilai = s.nextInt(); 
	if (nilai>80) { System.out.println ( " memuaskan " ) ; } 
	else if (nilai >60) {System.out.println ("  Bagus "); } 
	else { System.out.println ("anda gagal mulu, coba lagi 	!!!!!!) ");} 
} 
} 
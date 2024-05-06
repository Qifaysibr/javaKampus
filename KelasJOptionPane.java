import javax.swing.JOptionPane;

public class KelasJOptionPane{
    public static void main (String[]args) {
    //dektarasi variabel
    String nama;
    double tinggi;
    
    //perintah input
    nama = JOptionPane.showInputDialog("Masukkan Nama : ");
    tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi : "));
    //dialog output
    JOptionPane.showMessageDialog(null,"Nama : " + nama +
                                        "\nTinggi : " + tinggi);
                                    }
                                }
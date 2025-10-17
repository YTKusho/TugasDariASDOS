import javax.swing.*;
public class SegitigaSiku {
    public static void main(String[] args) {
        String Tinggi = JOptionPane.showInputDialog("Masukkan tinggi segitiga:");
        int tinggi = Integer.parseInt(Tinggi); 

        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

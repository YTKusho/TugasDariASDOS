import javax.swing.*;
public class SegitigaSikuR {
    public static void main(String[] args) {
        String Tinggi = JOptionPane.showInputDialog("Masukkan tinggi segitiga:");
        int tinggi = Integer.parseInt(String.valueOf(Tinggi));

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}

import javax.swing.*;
public class SegitigaBolaBale {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan tinggi segitiga:");
        int n = Integer.parseInt(input); // tinggi segitiga

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

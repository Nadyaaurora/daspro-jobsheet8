import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai N (min.3): ");
        int n = sc.nextInt();

        if (n < 3) {
            return;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(n + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

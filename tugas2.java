import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlCabor, i = 1, j=1;
        String namaCabor, namaAtlet, daftarAtlet;
      
        System.out.print("Nama Politeknik : ");
        String namaPoliteknik = sc.nextLine();
     
        System.out.print("Masukkan jumlah cabor : ");
        jmlCabor = sc.nextInt();
        sc.nextLine();

        for (i=1; i <= jmlCabor; i++) {
            System.out.print("Masukkan Nama Cabor ke- " + i + ": ");
            namaCabor = sc.nextLine();
            daftarAtlet = "";
            
            for (j=1; j <=5; j++){
                System.out.print("Nama Atlet ke- " + j + ": ");
                namaAtlet=sc.nextLine(); 
                daftarAtlet += "- " + namaAtlet + "\n";
        }    
        System.out.println("Nama Atlet Cabor " + namaCabor + " :" );
        System.out.println(daftarAtlet);
        }
    }
}
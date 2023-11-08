import java.util.Scanner;

public class TugasDaspro3 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan tinggi berlian : ");
            int tinggi_berlian = sc.nextInt();
    
            // Bagian atas berlian (segitiga terbalik pertama)
            for (int baris = 1; baris <= tinggi_berlian; baris++) {
                for (int spasi = 1; spasi <= tinggi_berlian - baris; spasi++) {
                    System.out.print(" ");
                }
                for (int bintang = 1; bintang <= 2 * baris - 1; bintang++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            // Bagian bawah berlian (segitiga terbalik kedua)
            for (int baris = tinggi_berlian - 1; baris >= 1; baris--) {
                for (int spasi = 1; spasi <= tinggi_berlian - baris; spasi++) {
                    System.out.print(" ");
                }
                for (int bintang = 1; bintang <= 2 * baris - 1; bintang++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
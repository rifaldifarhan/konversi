import java.util.Scanner;

/**
 *
 * @author Rifaldi
 */
public class KonversiWaktu {

    private static String menit;

       public static void main(String[] args) {
        
        System.out.println("Pilihan Konversi :\n"
                + " 1. Jam -> Menit\n"
                + " 2. Detik -> Hari, jam, menit, dan detik");

        System.out.println("\nMasukkan pilihan :");
        try (Scanner option = new Scanner(System.in)) {
            if (!option.hasNextInt()) {
                System.out.println("Itu alfabet, anda salah!");
            }else {
                if (option.nextInt() == 1) {
                    System.out.println("Masukkan jam :");
                    Scanner hours = new Scanner(System.in);
                    jamKeMenit(hours.nextInt());
                }else {
                    System.out.println("Masukkan jam :");
                    try (Scanner seconds = new Scanner(System.in)) {
                    detikKeHari(seconds.nextLong());                    
                }
            }
        }
    }
}
        
public static void jamKeMenit(long jam){ 
    long menit= jam*60;
    System.out.println("Menit : " + menit);
}

public static void detikKeHari(long detik) {
    //Hari
    int hari = (int) (detik / (60 * 60 * 24));
    
    //Jam
    int jam = (int) (detik / 60);
    
    //Menit
    detik %= (60 * 60);
    int menit = (int) (detik / 60);
    
    //Detik
    detik %= 60;
            
    System.out.println(hari + "Hari, " + jam + "jam, " + menit + "menit, " + detik + "detik" );
}
}

   
   
    

    
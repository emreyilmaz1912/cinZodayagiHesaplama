import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Çin Zodyağı Burcunuzu Hesaplama Programına Hoşgeldiniz!");
        double yearOfBirth, burc;
        boolean isError = true;


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Doğduğunuz Yılı Giriniz :");
            yearOfBirth = input.nextInt();
            burc = yearOfBirth % 12;

            if (burc == 0) {
                System.out.println("Çin Zodyağı Burcunuz: Maymun ");
            } else if (burc == 1) {
                System.out.println("Çin Zodyağı Burcunuz: Horoz ");
            } else if (burc == 2) {
             System.out.println("Çin Zodyağı Burcunuz: Köpek ");
            } else if (burc == 3) {
                System.out.println("Çin Zodyağı Burcunuz: Domuz ");
            } else if (burc == 4) {
                System.out.println("Çin Zodyağı Burcunuz: Fare ");
            } else if (burc == 5) {
                System.out.println("Çin Zodyağı Burcunuz: Öküz ");
            } else if (burc == 6) {
                System.out.println("Çin Zodyağı Burcunuz: Kaplan ");
            } else if (burc == 7) {
                System.out.println("Çin Zodyağı Burcunuz: Tavşan ");
            } else if (burc == 8) {
                System.out.println("Çin Zodyağı Burcunuz: Ejderha ");
            } else if (burc == 9) {
                System.out.println("Çin Zodyağı Burcunuz: Yılan ");
            } else if (burc == 10) {
                System.out.println("Çin Zodyağı Burcunuz: At ");
            } else if (burc == 11) {
                System.out.println("Çin Zodyağı Burcunuz: Koyun ");
            }else {
                System.out.println("Pozitif Bir Sayı Giriniz");
            }
        }
    }
}
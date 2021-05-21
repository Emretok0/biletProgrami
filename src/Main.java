import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total;
        System.out.print("Yaşınız: ");
        int age = input.nextInt();
        if (age > 0) {
            System.out.print("1. Tek yön\n2. Gidiş-Dönüş\n\nBilet tipini seçiniz (1-2): ");
            int tick = input.nextInt();

            if (tick == 1 || tick == 2) {
                System.out.print("Mesafeyi giriniz: ");
                int distance = input.nextInt();
                if (distance > 0) {
                    switch (tick) {
                        case 1:
                            total = distance * 0.10;
                            if (age < 12) {
                                total -= total * 0.5;
                            } else if (age <= 24) {
                                total -= total * 0.1;
                            } else if (age > 65) {
                                total -= total * 0.3;
                            }
                            System.out.println("Toplam tutar: " + total);
                            break;
                        case 2:
                            total = distance * 0.10 * 2;
                            if (age < 12) {
                                total -= total * 0.5;
                                total -= total * 0.2;
                            } else if (age <= 24) {
                                total -= total * 0.1;
                                total -= total * 0.2;
                            } else if (age > 65) {
                                total -= total * 0.3;
                                total -= total * 0.2;
                            }
                            System.out.println("Toplma tutar: " + total);
                            break;
                        default:
                            System.out.println("Hatalı Veri Girdiniz !");
                            break;
                    }
                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            } else {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}

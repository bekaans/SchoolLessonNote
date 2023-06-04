import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Ders Notunuzu Giriniz :"); int mat = input.nextInt();
        System.out.println("Fizik Ders Notunuzu Giriniz :"); int fiz = input.nextInt();
        System.out.println("Türkçe Ders Notunuzu Giriniz :"); int turk = input.nextInt();
        System.out.println("Kimya Ders Notunuzu Giriniz :"); int kim = input.nextInt();
        System.out.println("Müzik Ders Notunuzu Giriniz :"); int muz = input.nextInt();
     double ort = (mat+fiz+muz+kim+turk)/5;
     if (ort>=55){
         System.out.println("Geçtiniz...");
     } else {
         System.out.println("Kaldınız...");
     }
    }
}
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("hadi sayıyı tahmin edelim!");
        System.out.println("1 ie 100 arasında bir sayı gir.");

        boolean haswon = false;

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {

            System.out.println(i + " tahmin hakkı kaldı.");
            int number = scanner.nextInt();

            if (number > randomNumber) {
                System.out.println("Daha Küçük bir sayı gir.");
            } else if (number < randomNumber) {
                System.out.println("Daha büyük bir sayı gir");
            } else {
                haswon = true;
                break;
            }

        }

        if (haswon) {
            System.out.println("Tebrikler doğru sayıyı tahmin ettin.");
        } else {
            System.out.println("Oyunu kaybettin. Bulman gereken sayı " + randomNumber + " sayısıydı.");
        }

    }
}

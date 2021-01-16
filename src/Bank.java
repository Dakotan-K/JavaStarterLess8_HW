import java.util.Scanner;

public class Bank {

    static void payCredit(int credit, int summa) {
            if (credit == summa) {
                System.out.println("Кредит погашен");
            } else if (credit < summa) {
                System.out.println("Кредит погашен, переплата составила = " + (summa - credit));
            } else {
                System.out.println("Платеж по кредиту = " + summa + ", остаток по кредиту = " + (credit - summa));
            }
        }

        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму кредита: ");
        int credit = in.nextInt();
        System.out.println("Введите сумму для погашения кредита: ");
        int summa = in.nextInt();
        payCredit(credit, summa);
    }
}

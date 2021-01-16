import java.util.Scanner;

public class Delivery {

    static int factorial(int a) {
        if (a == 1)
            return 1;
        else {
            int number = a - 1;
            return a * factorial(number);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество клиентов: ");
        int clients = in.nextInt();
        System.out.println("Количество возможных маршрутов = " + factorial(clients));
    }
}

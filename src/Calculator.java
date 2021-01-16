import java.util.Scanner;

public class Calculator {
    static void calculate (int a, int b, int c) {
        System.out.println("Результат деления ваших чисел на 5: ");
        System.out.println(a/5);
        System.out.println(b/5);
        System.out.println(c/5);
    }
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("Введите первое целоцисленное число: ");
        int one = a.nextInt();
        System.out.print("Введите второе целоцисленное число: ");
        int two = a.nextInt();
        System.out.print("Введите третье целоцисленное число: ");
        int three = a.nextInt();

        calculate(one, two, three);

    }
}

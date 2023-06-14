import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception{
        //task1();
        //task2();
        task3();
    }
    private static void task1() {
        //1) Вычислить сумма чисел от 1 до n
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int value = iScanner.nextInt();
        System.out.println("Сумма цифр равна: " + sumNumber(value));

    }
    public static int sumNumber(int value) {
        int count = 0;
        for (int i = 1; i <= value; i++) {
            count += i;
        }
        return count;
    }
    
    private static void task2() {
        //2) Вывести все простые числа от 1 до 1000
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count < 2)
                System.out.println(i);
        }
    }

    private static void task3() {
        double num1;
        double num2;
        double result;
        char operation;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        num1 = iScanner.nextDouble();
        num2 = iScanner.nextDouble();
        System.out.print("Выберите операцию (+, -, *, /): ");
        operation = iScanner.next().charAt(0);
        if (operation == '+') {
            result = num1 + num2;
            System.out.print(num1 + " + " + num2 + " = " + result);
        }
        else if (operation == '-') {
            result = num1 - num2;
            System.out.print(num1 + " - " + num2 + " = " + result);
        }
        else if (operation == '*') {
            result = num1 * num2;
            System.out.print(num1 + " * " + num2 + " = " + result);
        }
        else if (operation == '/') {
            result = num1 / num2;
            System.out.print(num1 + " / " + num2 + " = " + result);
        }
        else {
            System.out.print("Несуществующая операция!");
        }

    }
}


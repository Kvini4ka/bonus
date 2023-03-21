import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        int balance = 1100;
        int bonus;
        int total;

        if (balance < 1000) {
            bonus = 0;
            balance = balance + 100;
            System.out.printf("Ваш баланс равен: " + balance + " Баланс вашего бонусного счета равен: " + bonus);

        } else {
            total = balance / 100;
            balance = balance + 100 + total;
            System.out.printf("Ваш баланс равен: " + balance + " Баланс вашего бонусного счета равен: " + total);
        }
    }
}
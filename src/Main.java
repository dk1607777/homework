import javax.print.attribute.standard.Severity;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание " + 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("задание 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("задание 5");
        for (int i = 1904; i <=2096; i = i + 4) {
            System.out.println(i + "год является високосным ");
        }
        System.out.println("задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("задание 7");
        for (int i = 1; i <=512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println("задание 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 0; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + "с умма накопленая за месяц " + total1);
        }
        System.out.println(" задание  10");
        for (int a = 1; a <= 10; a++) {
            System.out.printf("%d x %d=%d%n", 2, a, 2 * a);
        }
    }
}
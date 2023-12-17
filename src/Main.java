import javax.print.attribute.standard.Severity;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание " + 1);
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + "тобон совепшеннолетний");

        } else {
            System.out.println("если возраст человека " + age + " он не достиг совершеннолетия,нужно немного подождать");
        }
        System.out.println("задание " + 2);
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println(" На улице " + temperature + " градусов ,нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки ");
        }
        System.out.println("задание " + 3);
        int speed = 100;
        if (speed > 60) {
            System.out.println("если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("если скорость " + speed + " то можно ездить спокойно");
        }
        System.out.println("задание " + 4);
        age = 16;
        if (age >= 2 && age <= 6) {
            System.out.println("если возраст человека равен " + age + "то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("если возрост человека равен " + age + " то ему нужно ходить в школу ");
        } else if (age >= 18 && age <= 24) {
            System.out.println("если возрост человека равен " + age + " то его место в университете");
        } else if (age > 24) {
            System.out.println("если возраст человека равен " + age + "то его место на работе ");
        }
        System.out.println("задание " + 5);
        age = 2;
        if (age < 5) {
            System.out.println(" если возраст ребенка равен " + age + " то ему нельзя кататься на оттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("если возраст ребенка раен " + age + " можно кататься на атракционе в сопровождении");
        } else if (age >= 14) {
            System.out.println("если возраст ребенка равен " + age + " можно кататься без сопровождения взрослого ");
        }
        System.out.println("задание " + 6);
        int capacity = 102;
        int seatCapacity = 60;
        int standCapacity = capacity - seatCapacity;
        int takenSeatCapacity = 43;
        int takenStandCapacity = 40;
        int freeSeatCapacity = seatCapacity - takenSeatCapacity;
        int twoStandCapacity = standCapacity - takenStandCapacity;
        if (freeSeatCapacity == 0 && freeSeatCapacity == 0 ) {

        } else if (freeSeatCapacity != 0) {
            System.out.println("В вагоне есть " + freeSeatCapacity + " сидячих мест");
        } if ( twoStandCapacity != 0 ) {
            System.out.println("В вагоне есть " + twoStandCapacity + " стоячих мест ");
        }
        System.out.println("задание 7");
        int one =1;
        int two = 2;
        int three = 3;
        int max;
        if(one< two) {
            max = one;
        } else {
            max = two;
        }
        if (three < max) {
            max = three;
        }
        System.out.println("Мфксимум из 3 чисел" + max);
    }
}
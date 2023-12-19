import javax.print.attribute.standard.Severity;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание " + 1);
        char clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложение для IOS по ссылке ");
        } else {
            if (clientOS > 0) ;
            System.out.println("Установите версию приложения для Android по ссылке ");
        }
        System.out.println("задание 2 ");
         int clientOS1 = 0;
        int clientDeviceYear = 2020;
        int limitYear = 2015;
        if (clientOS1 == 0 && clientDeviceYear > limitYear) {
            System.out.println(" Установите версию приложения для IOS  по сылке  ");
        } else if (clientOS1 ==0 &&clientDeviceYear <= limitYear) {
            System.out.println("Установите облегченную версию  для приложения IOS по сылке ");
        } else if (clientOS1 == 1 && clientDeviceYear >limitYear) {
            System.out.println("Установите облегченую  для Android по сылке ");
        } else  {
            System.out.println("Устанровите облегченую версию приложение для Android ");
        }
        System.out.println("задание 3");
        int year = 1812;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + "- год високосный");
        } else {
            System.out.println("Год " + year + "-не високосный");
        }
        System.out.println("задание 4 ");
        int deliveryDistance = 80;
        int days = 1;
        if (deliveryDistance >= 20) {
            days++;
        }
        if (deliveryDistance >= 60) {
            days++;
        }
        if (deliveryDistance > 100) {
            days = -1;
        }
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней :" + days);
        }
        System.out.println("задание 5");
        int monthNumber = 5;
        switch ( monthNumber ) {
            case 12, 1, 2:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит сезону зима");
                break;
            case 3, 4, 5:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит сезону весне ");
                break;
            case 6, 7, 8:
                System.out.println("месяц под номером " + monthNumber + " принадлежит сезону лето ");
                break;
            case 9,10,11:
                System.out.println("Месяц под номером " + monthNumber +  " принадлежит сезону осень ");
                break;

        }

    }
}
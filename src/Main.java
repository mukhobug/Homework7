import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n Первое задание:");
        task1();
        System.out.println("\n\n\n Второе задание:");
        task2();
        System.out.println("\n\n\n Третье задание:");
        task3();
    }

    public static void task1() {
        checkYear(2021);
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        int clientOS = 0, clientDeviceYear = 2015;
        checkPhone(clientOS, clientDeviceYear);
    }

    public static void checkPhone(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int deliveryDistance = 95;
        int days = checkDelivery(deliveryDistance);
        System.out.println("Потребуется дней: " + days);
    }

    public static int checkDelivery(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        return days;
    }
}
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int year = 1985;
        checkYear(year);

        byte clientOS = 1;
        int clientDeviceYear = 2014;
        checkDevice(clientOS, clientDeviceYear);

        int deliveryDistance = 155;
        int deliveryDays = checkDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void checkYear(int y) {

        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            System.out.printf("%d год является високосным\n", y);
        else
            System.out.printf("%d год не является високосным\n", y);
    }

    public static void checkDevice(byte clientOs, int year) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0) {
            if (year < currentYear)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (year < currentYear)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int checkDeliveryDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance < 20) {
            return days;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return days += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return days += 2;
        }
        else {
            return days=0;
        }


    }

}
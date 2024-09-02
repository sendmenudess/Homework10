public class Main {
    public static void main(String[] args) {

        int year = 1985;
        checkYear(year);

        byte clientOS = 1;
        int clientDeviceYear = 2014;
        checkDevice(clientOS, clientDeviceYear);

        int deliveryDistance = 95;
        delivery(deliveryDistance);
    }
    public static void checkYear( int y){

        if ((y%4 == 0 && y % 100 !=0)|| y % 400 == 0)
            System.out.printf("%d год является високосным\n", y);
        else
            System.out.printf("%d год не является високосным\n", y);
    }
    public static void checkDevice(byte a, int y){
        if (a == 0){
            if (y < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else{
            if (y < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void delivery(int a){
        int days = 1;
        if (a < 20)
            System.out.println("Потребуется дней:" + days);
        else if (a >= 20 && a < 60)
            System.out.println("Потребуется дней:" + (days+1));
        else if (a >= 60 && a < 100)
            System.out.println("Потребуется дней:" + (days+2));
        else
            System.out.println("Доставки нет");
    }
}
public class Main {
    public static void main(String[] args) {
        // Задание 1
        int year = 2000;
        checkLeapAndPrint(year);

        // Задание 2
        int deviceYear = 2017;
        int clientOs = 5;
        boolean oldDevice = isOldDevice(deviceYear);
        String resultMessage = "Установите ";

        if (oldDevice) {
            resultMessage += "Lite ";
        }

        resultMessage += "версию для ";

        if (clientOs == 1) {
            resultMessage += "Android";
        } else {
            resultMessage += "iOS";
        }

        System.out.println(resultMessage);

        // Задание 3
        int deliveryDistance = 788;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays != -1) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка на данное расстояние невозможна.");
        }
    }

    private static void checkLeapAndPrint(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("%d год - високосный год%n", year);
        } else {
            System.out.printf("%d год - невисокосный год%n", year);
        }
    }

    public static boolean isOldDevice(int year) {
        return year < 2015;
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int result = -1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            result = 1;
        } else if (deliveryDistance <= 60) {
            result = 2;
        } else if (deliveryDistance <= 100) {
            result = 3;
        }
        return result;
    }
}
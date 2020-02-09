public class Main {

    public static void main(String[] args) {
        byte a = 15;
        short b = 200;
        int c = 1000;
        long d = 3000000L;
        float i = 10.57f;
        double f = -375.659;
        char g = '*';
        boolean j = true;
        System.out.println(calculate(1.97f, 1.85f, 3.23f, 8.63f));
        System.out.println(task10and20(10, 12));
        isPositiveOrNegative(-50);
        System.out.println(isNegative(5));
        greetings("Анна");
    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum > 9 && sum < 21) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!!!");
    }
}


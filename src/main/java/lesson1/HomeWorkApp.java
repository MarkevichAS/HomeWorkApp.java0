package lesson1;
// 1 задание
public class HomeWorkApp {
    public static void main(String[] args) {
//printThreeWords();
        //checkSumSign();
        //printColor();
        compareNumbers();
    }




    // 2 задание
    static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // 3 задание
    private static void checkSumSign() {
        int a = 15;
        int b = -7;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
            else {
                System.out.println("Сумма отрицательная");
            }


    }
    // 4 задание
    private static void printColor() {
        int value = 500;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }


    }
    private static void compareNumbers() {
        int a = 15;
        int b = -7;
        if (a >= b) {
            System.out.println("a >= b");}
            else {
                System.out.println("a < b");

    }

    }
}
import java.util.Scanner;

public class IvanovJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Задача №1.

        System.out.println("Задача №1: Составить алгоритм: если введенное число больше 7, то вывести “Привет”");
        System.out.println("Введите число:  ");
        double x = scan.nextDouble();
        System.out.println("Результат решения задачи №1: " + IvanovJava.ComparisonWithSeven(x));

        //Задача №2.

        System.out.println("Задача №2: Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"");
        System.out.println("Введите имя: ");
        String name = scan.next();
        System.out.println("Результат решения задачи №2: " + IvanovJava.ComparisonWithName(name));

        //Задача №3.

        System.out.println("Задача №3: Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
        System.out.println("Создадим массив из 10 элементов в диапазоне [ -200; 400] (400 включительно) заполнив через цикл for и метод random класса Math");

        int [] massiv = new int[10];

        for (int i = 0; i < massiv.length; i++) {
        massiv [i] = (int) (Math.random()*(600+1)) - 200;
        System.out.println(massiv[i]);
        }

        System.out.println("Результат решения задачи №3: ");

        for (int i=0; i< massiv.length; i++) {
            if (massiv[i]%3==0) {
                System.out.println(massiv[i]);
            }
        }

    }


    public static String ComparisonWithSeven (double variableBeingTested) {
        double referenceVariable = 7.0;
        if (referenceVariable < variableBeingTested){
            return ("Привет!");
        } else {

        }

        return ("  ");
    }

    public static String ComparisonWithName (String variableBeingTested) {
        String referenceVariable = "Вячеслав";
        if (variableBeingTested.equals(referenceVariable)){
            return "Привет, Вячеслав!";
        } else {
            return "Нет такого имени";
        }
    }

}

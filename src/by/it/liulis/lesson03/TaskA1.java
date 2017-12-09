package by.it.liulis.lesson03;

/*
Lesson 04. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.
4. Программа должна выводить double сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */


import java.util.Scanner;

class TaskA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        forInt(x, y);
        forDouble(x, y);
    }

    public static void forInt(int x, int y) {
        int summa = x + y;
        int substraction = x - y;
        int multiplication = x * y;
        int division = x / y;
        int remainder = x % y;
        System.out.printf("%d %d %d %d %d%n", summa, substraction, multiplication, division, remainder);
    }

    public static void forDouble(int x, int y) {
        double x1 = (double) x;
        double y1 = (double) y;
        double summa = x1 + y1;
        double substraction = x1 - y1;
        double multiplication = x1 * y1;
        double division = x1 / y1;
        double remainder = x1 % y1;
        System.out.println(summa + " " + substraction + " " + multiplication + " " + division + " " + remainder);
    }
}

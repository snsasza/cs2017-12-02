
/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
package by.it.radovnya.lesson02;

import java.util.Scanner;

class TaskC3 {
    public static void  main (String[] args ){
        Scanner n =new Scanner(System.in);
        System.out.println("Vvedite ves cheloveka: ");
        int p = n.nextInt();
        System.out.println( "Ves cheloveka na Marse: " + TaskC3.getWeight(p));
    }
    public static double getWeight(int weight){
        double z = 9.81;
        double m = 3.86;
        double d = weight/z*m*100;
        int i = (int)Math.round(d);
        return ((double)i/100);
    }
}

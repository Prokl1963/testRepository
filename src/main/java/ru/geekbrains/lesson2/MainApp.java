package ru.geekbrains.lesson2;

//Created by Sergey Isakov 03.12.2020
/*
Домашнее задание Java1. Level1. Step2
1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональныеэлементы единицами, используя цикл(ы);
6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
 checkBalance([1, 1, 1, || 2, 1]) → true,
 checkBalance ([2, 1, 1, 2, 1]) → false,
 checkBalance ([10, || 1, 2, 3, 4]) → true.
Абстрактная граница показана символами ||, эти символы в массив не входят.
7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
[1,2,3,4,5], -2 => [3,4,5,1,2]
[1,2,3,4,5], 2 => [4,5,1,2,3]
8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
 */


import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

        int[] firstArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("исходный массив      ");
        System.out.println(Arrays.toString(firstArr));
        System.out.println();
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] != 0) {
                firstArr[i] = 0;
            } else {
                firstArr[i] = 1;
            }
        }
        System.out.print("результирующий массив");
        System.out.println(Arrays.toString(firstArr));
        System.out.println();


        // 2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

        System.out.println("заполняем массив 1 4 7 10 13 16 19 22");
        int i;
        int[] secondArr = new int[8];
        secondArr[0] = 1;
        for (i = 1; i < 8; i++) {
            secondArr[i] = secondArr [i - 1] + 3;
        }
        System.out.print("        ");
        System.out.println(Arrays.toString(secondArr));
        System.out.println();

        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;

        int [] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("исходник:  ");
        System.out.println(Arrays.toString(thirdArr));
        int n=0;
        for (n=0; n<thirdArr.length; ++n) {
            if (thirdArr [n]<6) {
                thirdArr [n] = thirdArr [n]*2;
            }
        }
        System.out.print("результат: ");
        System.out.println(Arrays.toString(thirdArr));
        System.out.println();

        //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

        int [] fourthArr = {2, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 34};
        int min = fourthArr[0];
        int max = fourthArr [0];
        for (n=0; n<fourthArr.length; ++n) {

            if (fourthArr [n] < min) {
                min = fourthArr[n];
            } else if (fourthArr [n] > max) {
                max = fourthArr [n];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}



//return subtotal [];




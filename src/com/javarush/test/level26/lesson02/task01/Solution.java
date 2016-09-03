package com.javarush.test.level26.lesson02.task01;

import java.util.Comparator;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution  {
    public static void main(String[] args) {
        Integer[] integers={3, 4, 7, 6, 5, 2, 1, 11, 5, 48, 49, 56, 92, 94};
        sort(integers);
        for (Integer integer : integers) {
            System.out.print(integer + ", ");
        }
    }
    public static Integer[] sort(Integer[] array)  {
        double med;
        if(array.length%2==0){
            med = array[array.length/2-1];
        }
        else {
            med=array[array.length/2];
        }
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        //implement logic here

        return array;
    }



}

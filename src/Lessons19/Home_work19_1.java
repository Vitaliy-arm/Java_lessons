package Lessons19;

//Создайте класс, в котором создайте метод sortirovka. Инпут
//параметром данного метода будет одномерный массив типа
//int. Метод должен возвращать уже отсортированный по
//возрастанию массив .
//Продемонстрируйте данный метод.

import java.util.Arrays;

public class Home_work19_1 {
    public static void sortirovka (int [] array){

        // Arrays.sort(array);
        // System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            int min = array[i];
            for (int c = 0; c < array.length; c++) {
                if (min < array[c]) {
                    min = array[c];
                    int change = array[i];
                    array[c] = change;
                    array[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array1 = {-8, 1, 2, 4, 9, 7, 5, -4, -8, 12, -13};
        sortirovka(array1);
    }
}
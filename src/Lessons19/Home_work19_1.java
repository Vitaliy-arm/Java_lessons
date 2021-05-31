package Lessons19;

//Создайте класс, в котором создайте метод sortirovka. Инпут
//параметром данного метода будет одномерный массив типа
//int. Метод должен возвращать уже отсортированный по
//возрастанию массив .
//Продемонстрируйте данный метод.

import java.util.Arrays;

public class Home_work19_1 {
    public static void sortirovka (int [] array){
        int min = array[0];

        //Arrays.sort(array);
        //System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                array[0] = array[i]; // TO DO
                array[0] = min;
            }
        }


        // TO DO
        for (int i = 1; i < array.length; i++){
            if (min >= array[i]){
                array[i] = array[i+1];
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array1 = {-8, 1, 2, 4, 9, 7, 5, -4, -8, 12, -13};
        sortirovka(array1);
    }
}

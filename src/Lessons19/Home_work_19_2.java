package Lessons19;

//Создайте класс, в котором создайте метод showArray. Инпут
//параметром данного метода будет двумерный массив типа
//String. Метод должен выводить на экран данный массив в
//следующем виде:
//{ {элемент00, элемент01}, {элемент10}, {элемент10, элемент11} }
//Содержимое,естественно, будет зависеть от Вашего массива.
//Продемонстрируйте данный метод.

import java.util.Arrays;

public class Home_work_19_2 {
    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1){
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1){
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.print(" }");

       // Native metod
       // System.out.println();
       // System.out.println(Arrays.deepToString(array));
    }



        public static void main (String[]args){
            String[][] array1 = {{"sadsd", "sdsd"}, {"sdsd"}, {"sdsd", "sdsds"}};
            showArray(array1);
        }
}

package Lessons21;

//Создайте класс, в котором создайте метод abc. Инпут
//параметром данного метода будет N-ое количество
//параметров типа String. Метод должен возвращать уже
//отсортированный объект ArrayList из неповторяющихся
//объектов типа String, взятых из параметра метода и выводить
//данный объект на экран.
//Продемонстрируйте данный метод.

import java.util.*;

public class Home_work_21 {
    public static ArrayList<String> abc(String... a){
        ArrayList<String> list1 = new ArrayList<>();
        for (String a1 : a){
            if (!list1.contains(a1)){
                list1.add(a1);
            }
        }
        Collections.sort(list1);
        System.out.println(list1);
        return list1;
    }

    public static void main(String[] args) {
        String a = "Hi";
        String b = "Bay";
        String c = "One";
        String d = "Two";
        String e = "Hi";
        ArrayList<String> list = new ArrayList<>(abc (a, b, c, d, e));

        /* Home_work_21 hm = new Home_work_21();
        hm.abc("Hi", "Bay", "One", "Two", "Hi");
        */
    }
}

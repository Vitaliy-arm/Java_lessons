package Lessons20;

//Создайте метод abc, инпут параметр которого – N-ое
//количество массивов типа String. В методе создайте новый
//массив, который будет состоять из элементов массивов-
//параметров и будет оутпутом данного метода. В методе main
//вызовите метод abc и его элементам, которые равны
//значениям command line параметров, присвойте значение
//null. Выведите элементы обновлённого массива на экран.
//Везде, где возможно, используйте foreach loop.
//Запустите приложение с командной строки.


public class Home_work_20 {
    public static String[] abc (String[] ... array){
        int length = 0;
        for (String[] array1 : array){
            length += array1.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] array1 : array){
            for (String s : array1){
               target[count] = s;
               count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"hi", "ok", "good"}, new String[]{"ok", "hello", "bye"});

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])){
                    target[i] = null;
                }
            }
        }
        for (String s : target){
            System.out.println(s + " ");
        }
        System.out.println();
    }
}

// Comand for run - java /home/vitaliy/IdeaProjects/Java_lessons/src/Lessons20/Home_work_20.java ok bye

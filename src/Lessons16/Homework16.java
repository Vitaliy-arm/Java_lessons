package Lessons16;

//Создайте класс, в котором создайте метод email. Данный
//метод должен принимать в инпут 1 String параметр. Данный
//параметр должен содержать в себе email-ы в следующем
//виде: ya@yahoo.com; on@mail.ru; ona@gmail.com; , т.е.
//После каждого e-mail должен стоять знак препинания “;”. Ваш
//метод должен выводить на экран информацию о том, какой
//почтой пользуются, исходя из параметра, т.е. оутпут должен
//быть следующего вида:
//yahoo
//mail
//gmail
//Продемонстрируйте данный метод.

public class Homework16 {

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }

    public static void email(String s) {
        String list = s;
        int a = 0; // position @
        int b = 0; // position .
        int i = 0; // position ;

        while(i < list.length() - 1){
            a = list.indexOf('@', i);
            b = list.indexOf('.', i);
            i = list.indexOf(';', i + 1);
            System.out.println(list.substring(a + 1, b));
        }
    }
}

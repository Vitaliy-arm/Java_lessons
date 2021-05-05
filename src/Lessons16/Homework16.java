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

    private static void email(String s) {
        String list = s;
        char a;
        int i;

        for(i=0; i < list.length(); i++){
            a = list.charAt(i);
            if(a == '@' || a == '.'){
                System.out.println();
            }

            else if (a != '.' && a != ';' && a != ' '){
                System.out.print(a);
            }

        }
        System.out.println();
    }
}

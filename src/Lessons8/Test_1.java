package Lessons8;

//В первом классе создайте 2 static метода. 1-ый пусть умножает 3 числа из
//параметра метода и возвращает их произведение; 2-ой – делит первое
//число из параметра на второе и ничего не возвращает, лишь выводит на
//дисплей в читабельном виде целое частное и остаток. Во втором классе
//по два раза используйте данные методы.
//2. В первом классе создайте static final переменную Пи = 3,14. Используйте
//данную константу в non-static методе, который принимает в параметре
//значение радиуса и вычисляет площадь круга по формуле: Площадь = Пи
//* радиус * радиус. Также используйте данную константу в static методе,
//который принимает в параметре значение радиуса и вычисляет длину
//окружности по формуле: Площадь = 2 * Пи * радиус. Создайте ещё один
//non-static метод, который принимает в параметре значение радиуса и
//выводит на экран информацию о радиусе, площади круга и длине
//окружности. Используйте все 3 метода во 2-м классе.

public class Test_1 {
   public static final double pi = 3.14;


    static double  multiply (double a, double b, double c) {
        double d = a*b*c;
        System.out.println(d);
        return d;
    }

    static void  division (double a, double b) {
        double k = a/b;
        double l = a % b;
        System.out.println(k + " и " + l);
    }

   public double circle_square (double radius){
        double square = pi * radius * radius;
        return square;
    }

   public static double circle_length (double radius2){
        double length = 2 * pi * radius2;
        return length;
    }

    public void print (double radius3){
        System.out.println("Радиус " + radius3);
        System.out.println("Площадь " + circle_square(radius3));
        System.out.println("Длина окружности " + circle_length(radius3));
    }


}



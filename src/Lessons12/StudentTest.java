package Lessons12;

//В классе StudentTest написать 2 метода, которые принимают 2 input
//параметра – 2 объекта класса Student из Lesson11. Первый метод
//сравнивает 2-х студентов, используя 1 if statement и логические
//операторы внутри него и выводит на экран информацию о том, равны ли
//студенты. Второй метод использует nested if statement, сравнивает все
//атрибуты студента по отдельности, выводит на экран информацию о том,
//равны ли студенты, а если не равны, то в чём именно было обнаруженно
//первое неравенство.

import Lessons11.Student;

public class StudentTest {
    public static void method1(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Students are the same");
        } else {
            System.out.println("Students are different");
        }

    }

    public static void method2(Student st1, Student st2){
        if (st1.name.equals(st2.name)){
                if (st1.course == st2.course){
                        if (st1.grade == st2.grade) {
                            System.out.println("Students are the same");
                        } else {
                            System.out.println("Student grade are different");
                        }
                } else {
                    System.out.println("Student course are different");
                }
        } else {
            System.out.println("Student name are different");
        }
    }

    public static void main(String[] args){
        Student st1 = new Student("Taras", 1, 5.3);
        Student st2 = new Student("Kirylo", 4, 4.3);

        method1(st1, st2);
        method2(st1, st2);
    }


}

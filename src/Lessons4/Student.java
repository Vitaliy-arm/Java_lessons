package Lessons4;

//1. Создайте 2 класса. 1-ый назовите Student. Он должен содержать в себе
//следующие атрибуты: номер студенческого билета, имя, фамилию, год
//обучения, средняя оценка по математике, средняя оценка по экономике,
//средняя оценка по иностранному языку. 2-ой класс назовите StudentTest.
//В нём Вы должны будете создать 3 разных объекта класса Student,
//вывести на экран в читабельном виде среднюю арифметическую оценку
//каждого студента (учитывая все 3 предмета).



public class Student {
    String student_id;
    String name;
    String lastname;
    int year;
    double avr_math;
    double avr_econ;
    double avr_language;
}



class StudentTest {

    double avr_aval(Student st) {
        double avr_evaluations = (st.avr_econ + st.avr_language + st.avr_math) / 3;
        System.out.println("Средняя оценка студента " + st.name + " " + st.lastname + " - " + avr_evaluations);
        return avr_evaluations;
    }

    public static void main(String[] args) {
        Student Michael = new Student();

        Michael.student_id = "st_12";
        Michael.name = "Michael";
        Michael.lastname = "Jonson";
        Michael.year = 3;
        Michael.avr_math = 4.5;
        Michael.avr_econ = 3.7;
        Michael.avr_language = 4.3;

    /*
        System.out.println("student_id - " + Michael.student_id);
        System.out.println("name - " + Michael.name);
        System.out.println("lastname - " + Michael.lastname);
        System.out.println("year - " + Michael.year);
        System.out.println("avr_evaluations - " + (Michael.avr_math + Michael.avr_language + Michael.avr_econ) / 3);
    */


        Student Vera = new Student();
        Vera.student_id = "st_24";
        Vera.name = "Vera";
        Vera.lastname = "Douwson";
        Vera.year = 2;
        Vera.avr_math = 3.8;
        Vera.avr_econ = 4.7;
        Vera.avr_language = 4.3;

    /*
        System.out.println();
        System.out.println("student_id - " + Vera.student_id);
        System.out.println("name - " + Vera.name);
        System.out.println("lastname - " + Vera.lastname);
        System.out.println("year - " + Vera.year);
        System.out.println("avr_evaluations - " + (Vera.avr_math + Vera.avr_language + Vera.avr_econ) / 3);
    */

        Student Nick = new Student();
        Nick.student_id = "st_2";
        Nick.name = "Nick";
        Nick.lastname = "Yanowskiy";
        Nick.year = 5;
        Nick.avr_math = 4.8;
        Nick.avr_econ = 4.5;
        Nick.avr_language = 4.9;
    /*
        System.out.println();
        System.out.println("student_id - " + Nick.student_id);
        System.out.println("name - " + Nick.name);
        System.out.println("lastname - " + Nick.lastname);
        System.out.println("year - " + Nick.year);
        System.out.println("avr_evaluations - " + (Nick.avr_math + Nick.avr_language + Nick.avr_econ) / 3);
    */

        StudentTest sTest = new StudentTest();
        sTest.avr_aval(Michael);
        sTest.avr_aval(Vera);
        sTest.avr_aval(Nick);
    }


}

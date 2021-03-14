package Lessons9;

public class Lesson_9 {
    int a = 20;

    Lesson_9(int b) {
        this.a = b;
        System.out.println(a);
    }

    public static void main (String [] args) {
        Lesson_9 test1 = new Lesson_9(50);
        Lesson_9 test2 = new Lesson_9(10);
        Lesson_9 test3 = new Lesson_9(130);
        Lesson_9 test4 = new Lesson_9(70);
        Lesson_9 test5 = new Lesson_9(90);
        Lesson_9 test6 = new Lesson_9(5);
        Lesson_9 test7 = new Lesson_9(25);
        Lesson_9 test8 = new Lesson_9(19);

        test1 = null;
        test2 = null;
        test3 = null;
        test4 = null;
        test5 = null;
        test6 = null;
    }
}

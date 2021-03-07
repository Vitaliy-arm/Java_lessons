package Lessons6;

public class Sum {

    int summa() {
        int sum = 0;
        System.out.println(sum);
        return sum;
    }

    int summa(int a) {
        int sum1 = a;
        System.out.println(sum1);
        return sum1;
    }

    int summa(int a, int b) {
        int sum2 = a+b;
        System.out.println(sum2);
        return sum2;
    }

    int summa(int a, int b, int c) {
        int sum3 = a+b+c;
        System.out.println(sum3);
        return sum3;
    }

    int summa(int a, int b, int c, int d) {
        int sum4 = a+b+c+d;
        System.out.println(sum4);
        return sum4;
    }
}

class SunTest {
    public static void main(String [] args) {
        Sum test = new Sum();
        test.summa(30,47,10,20);
    }
}

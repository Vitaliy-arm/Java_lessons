package Lessons10.p4;

import Lessons10.p1.A;
import Lessons10.p1.p2.B;
import Lessons10.p1.p2.p3.C;
import Lessons10.p4.p5.*;

import static Lessons10.p1.p2.B.*;

public class D {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        E e1 = new E();

        int d = a1.a + b1.b + b1.bb + c1.c + e1.e;


        System.out.println(d);
        System.out.println(b);

    }

}

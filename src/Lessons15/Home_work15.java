package Lessons15;

//Переписать домашнее задание из Урока 14 так, чтобы outer и
//inner циклы представляли собой while loop, а middle цикл
//представлял собой do while loop.

public class Home_work15 {
    public static void main(String[] args) {

        int hour = 0;

        Outer: while (hour < 6) {
            int minute = -1;
            Middle: do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                break Outer;
                }

                int second = 0;
                Inner: while (second < 59) {
                    second++;
                    if (second * hour > minute){
                        continue Middle;
                    }

                    System.out.println("Time is - " + hour + ":" + minute + ":" + second);
                }


            } while (minute < 59);

            hour++;

        }
    }
}

package Lessons14;

//Создать класс. В классе создать статичный метод, который будет
//выводить на экран время в формате «час:минута:секунда» в интервале от
//0 до 6 часов. Если час больше единицы и минута кратна 10-ти, то метод
//нужно закончить. Если же (секунда умноженная на час) больше минуты,
//то пора переходить на другую минуту. Продемонстрировать данный
//метод в действии.

public class Home_work14 {
    public static void main(String[] args) {
        OUTER: for (int hour = 0; hour <= 6; hour++){
            MIDDLE: for (int minute = 0; minute <= 59; minute++){
                if (hour > 1 && minute % 10 == 0){
                    break OUTER;
                }
                INNER: for (int second = 0; second <= 59; second++){
                    if (second * hour > minute){
                        continue MIDDLE;
                    }
                    System.out.println(hour+ ":" + minute + ":" + second);
                }
            }
        }
    }
}

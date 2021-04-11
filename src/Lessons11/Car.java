package Lessons11;

//Создайте класс Car с тремя переменными: цвет, мотор и количество
//дверей. Затем создайте класс CarTest, в котором должны быть 2 метода.
//1-ый изменяет количество дверей объекта класса Car на количество,
//прописанное в параметре метода. 2-ой принимает в параметры 2 объекта
//класса Car и меняет их цвета местами. Примените оба метода в main и
//выведите на экран атрибуты всех объектов.



public class Car {
    String color;
    String motor;
    int doors;


    public Car (String color, String motor, int doors) {
        this.color = color;
        this.motor = motor;
        this.doors = doors;
    }
}


class CarTest {

    public void changeDoor (Car c, int doors) {
        c.doors = doors;
    }

    public void changeColor(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }


    public static void main(String[] args){
        CarTest test = new CarTest();
        Car car1 = new Car("black", "V4", 2);
        Car car2 = new Car("white", "V8", 4);
        test.changeDoor(car1, 3);
        test.changeColor(car1, car2);

        System.out.println("Information about car 1 " + car1.color + ", " + car1.motor + ", " + car1.doors);

        System.out.println("Information about car 2 " + car2.color + ", " + car2.motor + ", " + car2.doors);

    }

}

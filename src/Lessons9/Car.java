package Lessons9;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color2, String engine2){
        count++;
        color = color2;
        engine = engine2;
    }

    public void showColor(){
        System.out.println("Цвет машины " + "color");
    }

    public void changeColor(String color3){
        System.out.println("Цвет машины изменился");
        int price = 0;
        color = color3;
        price += 1000;
    }

}

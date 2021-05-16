package Lessons18;

//Создайте класс, в котором создайте метод ravenstvo. Инпут
//параметрами данного метода будут 2 объекта класса
//StringBuilder. Метод должен иметь boolean return type,
//возвращать true, если значения объектов совпадают, false –
//если не совпадают.
//Продемонстрируйте данный метод.
//

public class HomeWork18 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length() == sb2.length()){
            for (int i=0; i<sb1.length(); i++){
                if (sb1.charAt(i) != sb2.charAt(i)){
                    return false;
                }
            }
            return true;
            } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        if (ravenstvo(sb1, sb2) == true){
            System.out.println("sb1 = sb2");
        } else {
            System.out.println("sb1 != sb2");
        }

    }

}

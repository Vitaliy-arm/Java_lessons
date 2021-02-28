package Lessons5;

//1. В класс BankAccount добавьте 2 метода. Первый метод называется
//popolnenieScheta и увеличивает баланс на сумму, которая указана в
//параметре этого метода. Второй метод называется snyatieSoScheta и
//уменьшает баланс на сумму, которая указана в параметре этого метода.

//2. Измените класс StudentTest так, чтобы среднюю арифметическую оценку
//студента выводил на экран метод. Т. е. создайте 1 метод, параметр
//которого – это объект класса Student, а в теле метода будет вычисляться
//средняя арифметическая оценка и выводиться на экран.

//3. Создайте класс Employee с атрибутами id, surname, age, salary,
//department, которые должны задаваться в конструкторе. В данном классе
//также создайте метод увеличения зар платы вдвое. Создайте второй
//класс EmployeeTest, в котором создайте 2 объекта класса Employee.
//Увеличьте зарплату каждому работнику вдвое с помощью метода и
//выведите на экран значение новой зар платы.

public class BankAccount {
    int id = 10;
    String name = "Nick";
    double balance = 100;

    void popolnenieScheta (double summaPopolneniya) {
        balance += summaPopolneniya;
        System.out.println("Сумма после поплнения = " + balance);
        System.out.println();
    }

    void snyatieSoScheta (double summaSnytiya) {
        balance += summaSnytiya;
        System.out.println("Сумма после снятия = " + balance);
    }

    class BankAccountTest {
        public void main(String[] args) {
            BankAccount MyAccount = new BankAccount();

            MyAccount.popolnenieScheta(20.2);
            MyAccount.snyatieSoScheta(30.4);

        }

    }


}

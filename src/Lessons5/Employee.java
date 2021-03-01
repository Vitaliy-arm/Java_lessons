package Lessons5;

//Создайте класс Employee с атрибутами id, surname, age, salary,
//department, которые должны задаваться в конструкторе. В данном классе
//также создайте метод увеличения зар платы вдвое. Создайте второй
//класс EmployeeTest, в котором создайте 2 объекта класса Employee.
//Увеличьте зарплату каждому работнику вдвое с помощью метода и
//выведите на экран значение новой зар платы.

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee (int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double bigSalary () {
        salary *= 2;
        return salary;
    }

}


class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "ivanov", 25, 555.55, "IT");
        Employee emp2 = new Employee(2, "Petrov", 30, 888.41, "Sales");

        emp1.bigSalary();
        System.out.println("New salary " + emp1.surname + " - " + emp1.salary);


        emp2.bigSalary();
        System.out.println("New salary " + emp2.surname + " - " + emp2.salary);

    }
}
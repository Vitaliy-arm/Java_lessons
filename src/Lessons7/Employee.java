package Lessons7;

//Пересоздайте класс Employee таким образом, чтобы
//переменная salary была недоступна вне класса, переменная
//surname была доступна отовсюду, а переменная id только
//внутри пакета. Также создайте 3 public метода, которые будут
//показывать на дисплее значения этих переменных. Создайте
//для данного класса 3 разных конструктора с public, default и
//private access modifier-ами. В констукторах присваивайте
//переменным класса значения из параметров. Создайте
//новые классы в том же и в другом пакете. Попытайтесь в них
//создать объекты класса Employee и вывести на экран
//значения переменных данного объекта с помощью метода
//println и методов самого класса.

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee (int id2){
        id = id2;
    }

    Employee (double salary2){
        salary = salary2;
    }

    private Employee (String surmane2){
        surname = surmane2;
    }


    public void getId(){
        System.out.println(id);
    }

    public void getSalary(){
        System.out.println(salary);
    }

    public void getSurname(){
        System.out.println(surname);
    }

}

class EmployeeTest{
    public static void main (String[] args) {
        Employee emp1 = new Employee(5);
        //Employee emp2 = new Employee("Jonson");
        Employee emp3 = new Employee(541.4);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
      //  System.out.println(emp1.salary);

        System.out.println(emp3.id);
        System.out.println(emp3.surname);
       // System.out.println(emp3.salary);


        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

        emp3.getId();
        emp3.getSalary();
        emp3.getSurname();

    }

}




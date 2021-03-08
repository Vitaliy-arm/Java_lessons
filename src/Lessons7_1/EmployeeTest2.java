package Lessons7_1;

import Lessons7.Employee;

public class EmployeeTest2 {
    public static void main (String[] args) {
        Lessons7.Employee emp1 = new Lessons7.Employee(5);
       // Lessons7.Employee emp2 = new Lessons7.Employee("Jonson");
       // Lessons7.Employee emp3 = new Lessons7.Employee(541.4);

        //System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

    }
}

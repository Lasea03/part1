package day04.Part1;

public class Main {

    public static void main(String[] args) {
        IEmployee empInterface = new EmployeeImpl();



        var listEmployee = empInterface.initListEmployee();

        empInterface.displayEmployee(listEmployee);


    }
}
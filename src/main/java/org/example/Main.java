package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee master = new Employee("11", "8(111)111-11-11", "Bob", "1" );
        Employee rab = new Employee("22", "8(222)222-22-22", "Tor", "2" );
        Employee buh = new Employee("33", "8(333)333-33-33", "Trinity", "3" );
        Employee dir = new Employee("44", "8(444)444-44-44", "Neo", "4" );

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.добавляетEmployees(master);
        employeeDirectory.добавляетEmployees(rab);
        employeeDirectory.добавляетEmployees(buh);
        employeeDirectory.добавляетEmployees(dir);
        ;
            System.out.println(employeeDirectory.searchPhoneNumber(master.name));
            System.out.println(employeeDirectory.searchWorkExperience(rab.workExperience));
            System.out.println(employeeDirectory.searchPersonnelNumber(buh.personnelNumber));


    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
  List <Employee> employeeList = new ArrayList<>();
    public void добавляетEmployees(Employee employee) {
        employeeList.add(employee);

    };
    public Employee searchWorkExperience(String workExperience) {
        for (Employee e:employeeList) {
            if (e.workExperience.equals(workExperience)) {
                return e;
            }
        }
        return null;
    };
    public String searchPhoneNumber(String name) {
        for (Employee e:employeeList) {
            if (e.name.equals(name)) {
                return e.phoneNumber;
            }
        }
        return "такой сотрудник не найден";
    };
    public Employee searchPersonnelNumber(String personnelNumber) {
        for (Employee e:employeeList) {
            if (e.personnelNumber.equals(personnelNumber)) {
                return e;
            }
        }
        return null;
    };




}

package org.example;
//Создать справочник сотрудников
//        Необходимо:
//        Создать класс справочник сотрудников, который содержит внутри
//        коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавления нового сотрудника в справочник

public class Employee {

    String personnelNumber;
    String phoneNumber;
    String name;
    String workExperience;

    public Employee() {
    }

    public Employee(String personnelNumber, String phoneNumber, String name, String workExperience) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personnelNumber='" + personnelNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", workExperience='" + workExperience + '\'' +
                '}';
    }
}

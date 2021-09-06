package homework.Stream;

import lombok.Data;

@Data
public class Employee {
    int salary;
    String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }



}

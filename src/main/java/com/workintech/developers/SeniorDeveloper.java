package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);  // Parent sınıfın constructor'ını çağırıyoruz
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing code as Senior Developer.");
        setSalary(getSalary() + 3000);  // Maaş artışı
    }
}

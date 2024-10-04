package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);  // Parent sınıfın constructor'ını çağırıyoruz
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing code as Junior Developer.");
        setSalary(getSalary() + 1000);  // Maaş artışı
    }
}

package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);  // Parent sınıfın constructor'ını çağırıyoruz
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing code as Mid Developer.");
        setSalary(getSalary() + 2000);  // Maaş artışı
    }
}

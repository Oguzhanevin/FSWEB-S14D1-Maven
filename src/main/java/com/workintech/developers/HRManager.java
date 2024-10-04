package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
    private MidDeveloper[] midDevelopers = new MidDeveloper[5];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[5];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void addEmployee(JuniorDeveloper junior) {
        addEmployeeToArray(juniorDevelopers, junior);
    }

    public void addEmployee(MidDeveloper mid) {
        addEmployeeToArray(midDevelopers, mid);
    }

    public void addEmployee(SeniorDeveloper senior) {
        addEmployeeToArray(seniorDevelopers, senior);
    }

    private void addEmployeeToArray(Employee[] array, Employee employee) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = employee;
                System.out.println(employee.getName() + " added to the team.");
                return;
            }
        }
        System.out.println("No space available for " + employee.getName());
    }

    @Override
    public void work() {
        System.out.println("HRManager " + getName() + " is managing the team.");
    }
}

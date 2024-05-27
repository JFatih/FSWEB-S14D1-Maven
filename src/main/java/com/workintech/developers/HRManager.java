package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDeveloper;
    private MidDeveloper[] midDeveloper;
    private SeniorDeveloper[] seniorDeveloper;

    public HRManager(long id, String name, int salary){
        super(id,name,salary);
    }

    public void work(int salary) {
        System.out.println("HRManager work");
        setSalary(salary);
    }

    public void addEmployee(JuniorDeveloper[] juniorDeveloper ) {
        this.juniorDeveloper = juniorDeveloper;
    }

    public void addEmployee(MidDeveloper[] midDeveloper ) {
        this.midDeveloper = midDeveloper;
    }

    public void addEmployee(SeniorDeveloper[] seniorDeveloper) {
        this.seniorDeveloper = seniorDeveloper;
    }
}

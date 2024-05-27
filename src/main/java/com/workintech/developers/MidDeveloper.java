package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, int salary) {
        super(id,name,salary);
    }

    public void work(int salary) {
        System.out.println("MidDeveloper work");
        setSalary(salary);
    }
}

package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, int salary){
        super(id,name,salary);
    }

    public void work(int salary) {
        System.out.println("JuniorDeveloper work");
        setSalary(salary);
    }
}

package com;

import java.util.List;

public class Inteface {
}
interface IEmployee{
    Void handlerUser();
    List<String> list();
}

class Employee{
    private Integer id;
    private String empName;
    private String empId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}

class EmployeeImpl implements IEmployee {

    @Override
    public Void handlerUser() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmpName("Emp 1");
        employee.setEmpId("emp123123123");
        return null;
    }

    @Override
    public List<String> list() {
        return null;
    }
}


package com.example.springdatajpa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Run implements CommandLineRunner {
    @Autowired
    EmpServ empServ;
    @Override
    public void run(String... args) throws Exception {
        Employee employee=new Employee();
        employee.setId(4L);
        employee.setFirstname("Ehsan");
        employee.setLastname("Madadi");
        empServ.save(employee);

        employee.setId(9L);
        employee.setFirstname("Ehsan");
        employee.setLastname("Solgi");
        empServ.save(employee);

        employee=new Employee();
        employee.setId(5L);
        employee.setFirstname("Ali");
        employee.setLastname("Eslamifar");
        empServ.save(employee);

        employee=new Employee();
        employee.setId(6L);
        employee.setFirstname("zahra");
        employee.setLastname("Madadvandi");
        empServ.save(employee);

        employee=new Employee();
        employee.setId(7L);
        employee.setFirstname("mohammad");
        employee.setLastname("Erfani");
        empServ.save(employee);

        System.out.println(empServ.findAll());
        System.out.println(empServ.findEmployeeBylastnameContaining("dad"));
    }
}

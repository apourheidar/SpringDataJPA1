package com.example.springdatajpa1;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmpServ {
    @Autowired
    EmployeeRepository employeeRepository;
    @Transactional
    public void save(Employee employee){
        employeeRepository.save(employee);
    }
    public String findAll(){return employeeRepository.findAll().toString();}
    public List<Employee> findEmployeeBylastnameContaining(String str){return employeeRepository.findEmployeesBylastnameContaining(str);}

}

package com.example.springdatajpa1;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    List<Employee> findEmployeesBylastnameContaining(String str);
}

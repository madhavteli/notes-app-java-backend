package net.javaguides.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

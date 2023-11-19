package com.dev.springboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.dev.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
			
		@Query("FROM Employee e")
		List<Employee> getAllEmployeeData();
		
}
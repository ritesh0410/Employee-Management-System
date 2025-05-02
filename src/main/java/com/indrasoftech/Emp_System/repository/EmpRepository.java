package com.indrasoftech.Emp_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indrasoftech.Emp_System.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{
	
}
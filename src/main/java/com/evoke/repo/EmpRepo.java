package com.evoke.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evoke.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}

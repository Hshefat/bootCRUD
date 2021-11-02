package com.sts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.model.Employee;
import com.sts.repository.EmpRepo;



@Service
public class EmpService {

	@Autowired
	private EmpRepo repo;
	
	
	public void addEmp (Employee e) {

		repo.save(e);
	}

	public List<Employee> getAllEmp(){

		return repo.findAll();
	}

	public Employee getEMpById(int id) {
		Optional<Employee> e = repo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}

	public void deleteEmp(int id) {
		repo.deleteById(id);
	}

}

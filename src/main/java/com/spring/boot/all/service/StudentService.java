package com.spring.boot.all.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.all.bean.StudentBean;
import com.spring.boot.all.entity.StudentEntity;
import com.spring.boot.all.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	public StudentRepository repository;

	public StudentEntity insert(StudentBean bean) {

		StudentEntity b = new StudentEntity();

		b.setId(bean.getId());
		b.setFname(bean.getFname());
		b.setLname(bean.getLname());

		repository.save(b);

		return b;
	}

}

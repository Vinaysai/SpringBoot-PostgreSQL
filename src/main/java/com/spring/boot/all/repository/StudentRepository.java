package com.spring.boot.all.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.all.entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, String> {

	
}
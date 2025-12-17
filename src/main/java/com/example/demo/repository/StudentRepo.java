package com.example.demo.repository;

import org.springfarmework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
import com.example.demo.entity.studentEntity;

  
public interface studentRepo  extends JpaRepository<StudentEntity,long>{

}
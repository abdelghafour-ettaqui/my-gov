package com.example.ministereeconomiefinance.repository;


import com.example.ministereeconomiefinance.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeRepo  extends JpaRepository<Employe,String> {
}

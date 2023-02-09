package com.example.ministerejustice.repository;


import com.example.ministerejustice.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeRepo  extends JpaRepository<Employe,String> {
}

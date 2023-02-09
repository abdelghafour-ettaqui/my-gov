package com.example.ministereeconomiefinance.repository;


import com.example.ministereeconomiefinance.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartementRepo extends JpaRepository<Departement,String> {

}

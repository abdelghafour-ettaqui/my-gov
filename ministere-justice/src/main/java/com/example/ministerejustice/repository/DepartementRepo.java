package com.example.ministerejustice.repository;


import com.example.ministerejustice.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartementRepo extends JpaRepository<Departement,String> {

}

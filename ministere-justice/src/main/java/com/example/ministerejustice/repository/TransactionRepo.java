package com.example.ministerejustice.repository;


import com.example.ministerejustice.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionRepo  extends JpaRepository<Transaction,String> {
}

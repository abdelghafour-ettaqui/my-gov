package com.example.ministereeconomiefinance;

import com.example.ministereeconomiefinance.entities.Minister;
import com.example.ministereeconomiefinance.entities.Departement;
import com.example.ministereeconomiefinance.repository.DepartementRepo;
import com.example.ministereeconomiefinance.repository.MinisterRepo;
import com.example.ministereeconomiefinance.repository.TransactionRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MinistereEconomieFinanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinistereEconomieFinanceApplication.class, args);
    }

}

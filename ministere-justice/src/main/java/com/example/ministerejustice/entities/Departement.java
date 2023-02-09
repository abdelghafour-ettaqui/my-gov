package com.example.ministerejustice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nom;

    @Column(name = "minister_id", nullable = true)
    private String minister_id;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private Minister minister;

    @OneToMany(mappedBy = "departement")
    private Collection<Employe> employés;
}

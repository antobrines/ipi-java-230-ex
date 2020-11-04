package com.ipiecoles.java.java230.repository;

import com.ipiecoles.java.java230.model.Employe;
import org.joda.time.LocalDate;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface EmployeRepository extends CrudRepository<Employe,Long> {
    Employe findByMatricule(String matricule);

    List<Employe> findByNomAndPrenom(String nom, String prenom);

    List<Employe> findByNomIgnoreCase(String nom);

    List<Employe> findByDateEmbaucheBefore(LocalDate date);

    List<Employe> findByDateEmbaucheAfter(LocalDate date);
}

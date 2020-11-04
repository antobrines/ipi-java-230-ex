package com.ipiecoles.java.java230;

import com.ipiecoles.java.java230.model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.ipiecoles.java.java230.repository.EmployeRepository;

import java.util.List;
import java.util.Optional;


@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Bonjour");
        Optional<Employe> employe = Optional.ofNullable(employeRepository.findByMatricule("M11109"));
        List<Employe> npE = employeRepository.findByNomAndPrenom("Andre", "Alexandre");
        npE.forEach(System.out::println);
        if (employe.isPresent()){
            System.out.println("Voici le nom de l'employé avec le matricule M11109 : " +  employe.get().getNom());
        } else {
            System.out.println("Aucun employé dispose de ce matricule");
        }

    }

    public static void print(Object t) {
        System.out.println(t);
    }
}

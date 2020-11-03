package com.ipiecoles.java.java230;

import com.ipiecoles.java.java230.model.Employe;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.ipiecoles.java.java230.repository.EmployeRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        String url = "jdbc:mysql://localhost:3306/entreprise";
        String user = "root";
        String pwd = "";

        java.sql.Connection connexion = null;

        try {
            connexion = java.sql.DriverManager.getConnection(url, user, pwd);
        } catch ( java.sql.SQLException e ) {
            //Problème de connexion à la base !
            print(e.getMessage());
        }

    }

    public static void print(Object t) {
        System.out.println(t);
    }
}

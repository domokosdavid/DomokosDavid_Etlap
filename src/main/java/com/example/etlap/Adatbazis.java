package com.example.etlap;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Adatbazis extends AdatbazisController{
    Connection connection;
    public Adatbazis() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/etlapdb", "root", "");
    }

    public List<Etel> getEtelek() throws SQLException {
        List<Etel> etelek = new ArrayList<>();
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM `etlap`\n" + "INNER JOIN kategoriak ON etlap.kategoria_id = kategoriak.id";
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {
            int id = result.getInt("id");
            String nev = result.getString("nev");
            String leiras = result.getString("leiras");
            int ar = result.getInt("ar");
            String kategoria = result.getString("kategoriak.nev");
            int kategoriaId = result.getInt("kategoriak.id");
            Etel obj = new Etel(id,nev,leiras,ar, kategoria, kategoriaId);
            etelek.add(obj);
        }
        return etelek;
    }

}

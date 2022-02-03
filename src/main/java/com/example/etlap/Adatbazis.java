package com.example.etlap;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Adatbazis extends AdatbazisController{
    Connection connection;
    public Adatbazis() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/etlapdb", "root", "");
    }

}

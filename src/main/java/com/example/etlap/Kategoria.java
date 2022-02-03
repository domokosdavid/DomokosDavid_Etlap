package com.example.etlap;

public class Kategoria {
    private String nev;
    private int id;

    public Kategoria(String nev, int id) {
        this.nev = nev;
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  this.getNev();
    }
}

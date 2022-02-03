package com.example.etlap;

public class Etel {
    private int id, ar, kategoriaid;
    private String nev, leiras, kategoria;

    public Etel(int id, String nev, String leiras, int ar, String kategoria, int kategoriaId) {
        this.id = id;
        this.ar = ar;
        this.kategoriaid = kategoriaid;
        this.nev = nev;
        this.leiras = leiras;
        this.kategoria = kategoria;
    }

    public int getId() {
        return id;
    }

    public int getAr() {
        return ar;
    }

    public int getKategoriaid() {
        return kategoriaid;
    }

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public String getKategoria() {
        return kategoria;
    }
}

package com.example.System_dla_przychodni_v2;

import jakarta.persistence.*;

@Entity
@Table (name = "lekarz")
public class Lekarz {
    public Long get_id_lekarza()
    {
        return id_lekarza;
    }

    public Long getId_lekarza() {
        return id_lekarza;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public Long getId_uzytkownika() {
        return id_uzytkownika;
    }

    @Id
    @Column(name="id_lekarza")
    private Long id_lekarza;

    public void setId_lekarza(Long id_lekarza) {
        this.id_lekarza = id_lekarza;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public void setId_uzytkownika(Long id_uzytkownika) {
        this.id_uzytkownika = id_uzytkownika;
    }

    @Column(name="specjalizacja")
    private String specjalizacja;

    @Column(name="id_uzytkownika")
    private Long id_uzytkownika;
}
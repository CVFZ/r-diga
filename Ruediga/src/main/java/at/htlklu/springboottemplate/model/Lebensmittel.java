package at.htlklu.springboottemplate.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Lebensmittel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "kategorie")
    private String kategorie;
    @Basic
    @Column(name = "bezeichnung")
    private String bezeichnung;
    @Basic
    @Column(name = "kcal100")
    private Integer kcal100;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Integer getKcal100() {
        return kcal100;
    }

    public void setKcal100(Integer kcal100) {
        this.kcal100 = kcal100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lebensmittel that = (Lebensmittel) o;
        return id == that.id && Objects.equals(kategorie, that.kategorie) && Objects.equals(bezeichnung, that.bezeichnung) && Objects.equals(kcal100, that.kcal100);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kategorie, bezeichnung, kcal100);
    }
}

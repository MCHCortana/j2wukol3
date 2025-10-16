package cz.czechitas.java2webapps.ukol3.entity;

import jakarta.validation.constraints.NotNull;

public class Vizitka {
    @NotNull
    private String jmeno;
    @NotNull
    private String firma;
    @NotNull
    private Adresa adresa;
    @NotNull
    private String email;
    private String telefon;
    private String web;

    public Vizitka() {
    }

    public Vizitka(String jmeno, String firma, Adresa adresa, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.adresa = adresa;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}

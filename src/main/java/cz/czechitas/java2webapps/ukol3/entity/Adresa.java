package cz.czechitas.java2webapps.ukol3.entity;

import jakarta.validation.constraints.NotNull;

public class Adresa {
    @NotNull
    private String ulice;
    @NotNull
    private String cisloPopisne;
    private String psc;

    public Adresa() {
    }

    public Adresa(String ulice, String cisloPopisne, String psc) {
        this.ulice = ulice;
        this.cisloPopisne = cisloPopisne;
        this.psc = psc;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getCisloPopisne() {
        return cisloPopisne;
    }

    public void setCisloPopisne(String cisloPopisne) {
        this.cisloPopisne = cisloPopisne;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }
}

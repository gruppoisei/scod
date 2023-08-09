package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GEPA_PAESE")
public class GepaPaese implements Serializable {
    private static final long serialVersionUID = 1241381074917407938L;
    @Id
    @Column(name = "GEPA_PAESEID", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "GEPA_CODICEPAESE", nullable = false, length = 20)
    private String gepaCodicepaese;

    @Size(max = 20)
    @NotNull
    @Column(name = "GEPA_CODICEPAESEALPHA2", nullable = false, length = 20)
    private String gepaCodicepaesealpha2;

    @Size(max = 20)
    @NotNull
    @Column(name = "GEPA_CODICEPAESEALPHA3", nullable = false, length = 20)
    private String gepaCodicepaesealpha3;

    @Size(max = 50)
    @NotNull
    @Column(name = "GEPA_SYSUSER", nullable = false, length = 50)
    private String gepaSysuser;

    @Column(name = "GEPA_SYSDATE")
    private LocalDate gepaSysdate;

    @Column(name = "GEPA_FLAG_ATTIVA")
    private Integer gepaFlagAttiva;

    @Size(max = 200)
    @NotNull
    @Column(name = "GEPA_DENOMINAZIONE", nullable = false, length = 200)
    private String gepaDenominazione;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGepaCodicepaese() {
        return gepaCodicepaese;
    }

    public void setGepaCodicepaese(String gepaCodicepaese) {
        this.gepaCodicepaese = gepaCodicepaese;
    }

    public String getGepaCodicepaesealpha2() {
        return gepaCodicepaesealpha2;
    }

    public void setGepaCodicepaesealpha2(String gepaCodicepaesealpha2) {
        this.gepaCodicepaesealpha2 = gepaCodicepaesealpha2;
    }

    public String getGepaCodicepaesealpha3() {
        return gepaCodicepaesealpha3;
    }

    public void setGepaCodicepaesealpha3(String gepaCodicepaesealpha3) {
        this.gepaCodicepaesealpha3 = gepaCodicepaesealpha3;
    }

    public String getGepaSysuser() {
        return gepaSysuser;
    }

    public void setGepaSysuser(String gepaSysuser) {
        this.gepaSysuser = gepaSysuser;
    }

    public LocalDate getGepaSysdate() {
        return gepaSysdate;
    }

    public void setGepaSysdate(LocalDate gepaSysdate) {
        this.gepaSysdate = gepaSysdate;
    }

    public Integer getGepaFlagAttiva() {
        return gepaFlagAttiva;
    }

    public void setGepaFlagAttiva(Integer gepaFlagAttiva) {
        this.gepaFlagAttiva = gepaFlagAttiva;
    }

    public String getGepaDenominazione() {
        return gepaDenominazione;
    }

    public void setGepaDenominazione(String gepaDenominazione) {
        this.gepaDenominazione = gepaDenominazione;
    }
}
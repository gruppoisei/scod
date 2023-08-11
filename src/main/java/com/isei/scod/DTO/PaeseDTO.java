package com.isei.scod.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class PaeseDTO {

    private Integer id;

    @Size(max = 20)
    @NotNull
    private String gepaCodicepaese;

    @Size(max = 20)
    @NotNull
    private String gepaCodicepaesealpha2;

    @Size(max = 20)
    @NotNull
    private String gepaCodicepaesealpha3;

    @Size(max = 50)
    @NotNull
    private String gepaSysuser;

    private LocalDate gepaSysdate;

    private Integer gepaFlagAttiva;

    @Size(max = 200)
    @NotNull
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

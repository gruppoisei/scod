package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class TipoBenefitAziendaliDTO {

    private Integer id;

    @Size(max = 50)
    @Nationalized
    private String antbBenefitaziendalidesc;

    @Size(max = 50)
    @NotNull
    private String antbSysuser;

    private LocalDate antbSysdate;

    private Integer antbFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAntbBenefitaziendalidesc() {
        return antbBenefitaziendalidesc;
    }

    public void setAntbBenefitaziendalidesc(String antbBenefitaziendalidesc) {
        this.antbBenefitaziendalidesc = antbBenefitaziendalidesc;
    }

    public String getAntbSysuser() {
        return antbSysuser;
    }

    public void setAntbSysuser(String antbSysuser) {
        this.antbSysuser = antbSysuser;
    }

    public LocalDate getAntbSysdate() {
        return antbSysdate;
    }

    public void setAntbSysdate(LocalDate antbSysdate) {
        this.antbSysdate = antbSysdate;
    }

    public Integer getAntbFlagAttiva() {
        return antbFlagAttiva;
    }

    public void setAntbFlagAttiva(Integer antbFlagAttiva) {
        this.antbFlagAttiva = antbFlagAttiva;
    }
}

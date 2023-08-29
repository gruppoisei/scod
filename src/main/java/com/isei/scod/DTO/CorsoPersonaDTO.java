package com.isei.scod.DTO;

import com.isei.scod.Entity.AncfCorsoformazione;
import com.isei.scod.Entity.AnpePersona;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class CorsoPersonaDTO {

    private Integer id;

    private AncfCorsoformazione ancpFkAncfCorsoformazioneid;

    private AnpePersona ancpFkAnpePersonaid;

    private LocalDate ancpDataInizio;

    private LocalDate ancpDataFine;

    @Size(max = 50)
    @NotNull
    private String ancpSysuser;

    private LocalDate ancpSysdate;

    private Integer ancpFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AncfCorsoformazione getAncpFkAncfCorsoformazioneid() {
        return ancpFkAncfCorsoformazioneid;
    }

    public void setAncpFkAncfCorsoformazioneid(AncfCorsoformazione ancpFkAncfCorsoformazioneid) {
        this.ancpFkAncfCorsoformazioneid = ancpFkAncfCorsoformazioneid;
    }

    public AnpePersona getAncpFkAnpePersonaid() {
        return ancpFkAnpePersonaid;
    }

    public void setAncpFkAnpePersonaid(AnpePersona ancpFkAnpePersonaid) {
        this.ancpFkAnpePersonaid = ancpFkAnpePersonaid;
    }

    public LocalDate getAncpDataInizio() {
        return ancpDataInizio;
    }

    public void setAncpDataInizio(LocalDate ancpDataInizio) {
        this.ancpDataInizio = ancpDataInizio;
    }

    public LocalDate getAncpDataFine() {
        return ancpDataFine;
    }

    public void setAncpDataFine(LocalDate ancpDataFine) {
        this.ancpDataFine = ancpDataFine;
    }

    public String getAncpSysuser() {
        return ancpSysuser;
    }

    public void setAncpSysuser(String ancpSysuser) {
        this.ancpSysuser = ancpSysuser;
    }

    public LocalDate getAncpSysdate() {
        return ancpSysdate;
    }

    public void setAncpSysdate(LocalDate ancpSysdate) {
        this.ancpSysdate = ancpSysdate;
    }

    public Integer getAncpFlagAttiva() {
        return ancpFlagAttiva;
    }

    public void setAncpFlagAttiva(Integer ancpFlagAttiva) {
        this.ancpFlagAttiva = ancpFlagAttiva;
    }
}

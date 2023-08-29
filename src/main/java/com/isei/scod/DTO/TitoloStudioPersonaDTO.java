package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class TitoloStudioPersonaDTO {

    private TitoloStudioPersonaIdDTO id;

    private TitoloStudioDTO antpFkAnstTitolostudioid;

    private PersonaDTO antpFkAnpePersonaid;

    private LocalDate antpDataConseguimento;

    private Integer antpVoto;

    @Size(max = 100)
    private String antpIstituto;

    @Size(max = 50)
    @NotNull
    private String antpSysuser;

    private LocalDate antpSysdate;

    private Integer antpFlagAttiva;

    public TitoloStudioPersonaIdDTO getId() {
        return id;
    }

    public void setId(TitoloStudioPersonaIdDTO id) {
        this.id = id;
    }

    public TitoloStudioDTO getAntpFkAnstTitolostudioid() {
        return antpFkAnstTitolostudioid;
    }

    public void setAntpFkAnstTitolostudioid(TitoloStudioDTO antpFkAnstTitolostudioid) {
        this.antpFkAnstTitolostudioid = antpFkAnstTitolostudioid;
    }

    public PersonaDTO getAntpFkAnpePersonaid() {
        return antpFkAnpePersonaid;
    }

    public void setAntpFkAnpePersonaid(PersonaDTO antpFkAnpePersonaid) {
        this.antpFkAnpePersonaid = antpFkAnpePersonaid;
    }

    public LocalDate getAntpDataConseguimento() {
        return antpDataConseguimento;
    }

    public void setAntpDataConseguimento(LocalDate antpDataConseguimento) {
        this.antpDataConseguimento = antpDataConseguimento;
    }

    public Integer getAntpVoto() {
        return antpVoto;
    }

    public void setAntpVoto(Integer antpVoto) {
        this.antpVoto = antpVoto;
    }

    public String getAntpIstituto() {
        return antpIstituto;
    }

    public void setAntpIstituto(String antpIstituto) {
        this.antpIstituto = antpIstituto;
    }

    public String getAntpSysuser() {
        return antpSysuser;
    }

    public void setAntpSysuser(String antpSysuser) {
        this.antpSysuser = antpSysuser;
    }

    public LocalDate getAntpSysdate() {
        return antpSysdate;
    }

    public void setAntpSysdate(LocalDate antpSysdate) {
        this.antpSysdate = antpSysdate;
    }

    public Integer getAntpFlagAttiva() {
        return antpFlagAttiva;
    }

    public void setAntpFlagAttiva(Integer antpFlagAttiva) {
        this.antpFlagAttiva = antpFlagAttiva;
    }
}
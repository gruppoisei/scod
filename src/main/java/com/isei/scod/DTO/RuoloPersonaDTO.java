package com.isei.scod.DTO;

import com.isei.scod.Entity.AnruRuolo;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class RuoloPersonaDTO {

    private Integer id;
    private PersonaDTO anrpFkAnpePersonaid;

    private AnruRuolo anrpFkAnruRuoloid;

    private LocalDate anrpDatainizio;

    private LocalDate anrpDatafine;

    private PersonaDTO anrpFkAnpePersonatutorid;

    @Size(max = 600)
    private String anrpNote;

    @Size(max = 100)
    private String anrpFormazionetrasversale1anno;

    @Size(max = 100)
    private String anrpFormazionetrasversale2anno;

    @Size(max = 100)
    private String anrpFormazionetrasversale3anno;


    private LocalDate anrpDatainizioformtecnica;

    private LocalDate anrpDatafineformtecnica;

    @Size(max = 50)
    @NotNull
    private String anrpSysuser;

    private LocalDate anrpSysdate;

    private Integer anrpFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonaDTO getAnrpFkAnpePersonaid() {
        return anrpFkAnpePersonaid;
    }

    public void setAnrpFkAnpePersonaid(PersonaDTO anrpFkAnpePersonaid) {
        this.anrpFkAnpePersonaid = anrpFkAnpePersonaid;
    }

    public AnruRuolo getAnrpFkAnruRuoloid() {
        return anrpFkAnruRuoloid;
    }

    public void setAnrpFkAnruRuoloid(AnruRuolo anrpFkAnruRuoloid) {
        this.anrpFkAnruRuoloid = anrpFkAnruRuoloid;
    }

    public LocalDate getAnrpDatainizio() {
        return anrpDatainizio;
    }

    public void setAnrpDatainizio(LocalDate anrpDatainizio) {
        this.anrpDatainizio = anrpDatainizio;
    }

    public LocalDate getAnrpDatafine() {
        return anrpDatafine;
    }

    public void setAnrpDatafine(LocalDate anrpDatafine) {
        this.anrpDatafine = anrpDatafine;
    }

    public PersonaDTO getAnrpFkAnpePersonatutorid() {
        return anrpFkAnpePersonatutorid;
    }

    public void setAnrpFkAnpePersonatutorid(PersonaDTO anrpFkAnpePersonatutorid) {
        this.anrpFkAnpePersonatutorid = anrpFkAnpePersonatutorid;
    }

    public String getAnrpNote() {
        return anrpNote;
    }

    public void setAnrpNote(String anrpNote) {
        this.anrpNote = anrpNote;
    }

    public String getAnrpFormazionetrasversale1anno() {
        return anrpFormazionetrasversale1anno;
    }

    public void setAnrpFormazionetrasversale1anno(String anrpFormazionetrasversale1anno) {
        this.anrpFormazionetrasversale1anno = anrpFormazionetrasversale1anno;
    }

    public String getAnrpFormazionetrasversale2anno() {
        return anrpFormazionetrasversale2anno;
    }

    public void setAnrpFormazionetrasversale2anno(String anrpFormazionetrasversale2anno) {
        this.anrpFormazionetrasversale2anno = anrpFormazionetrasversale2anno;
    }

    public String getAnrpFormazionetrasversale3anno() {
        return anrpFormazionetrasversale3anno;
    }

    public void setAnrpFormazionetrasversale3anno(String anrpFormazionetrasversale3anno) {
        this.anrpFormazionetrasversale3anno = anrpFormazionetrasversale3anno;
    }

    public LocalDate getAnrpDatainizioformtecnica() {
        return anrpDatainizioformtecnica;
    }

    public void setAnrpDatainizioformtecnica(LocalDate anrpDatainizioformtecnica) {
        this.anrpDatainizioformtecnica = anrpDatainizioformtecnica;
    }

    public LocalDate getAnrpDatafineformtecnica() {
        return anrpDatafineformtecnica;
    }

    public void setAnrpDatafineformtecnica(LocalDate anrpDatafineformtecnica) {
        this.anrpDatafineformtecnica = anrpDatafineformtecnica;
    }

    public String getAnrpSysuser() {
        return anrpSysuser;
    }

    public void setAnrpSysuser(String anrpSysuser) {
        this.anrpSysuser = anrpSysuser;
    }

    public LocalDate getAnrpSysdate() {
        return anrpSysdate;
    }

    public void setAnrpSysdate(LocalDate anrpSysdate) {
        this.anrpSysdate = anrpSysdate;
    }

    public Integer getAnrpFlagAttiva() {
        return anrpFlagAttiva;
    }

    public void setAnrpFlagAttiva(Integer anrpFlagAttiva) {
        this.anrpFlagAttiva = anrpFlagAttiva;
    }
}

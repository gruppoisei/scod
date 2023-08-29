package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class RichiestaDTO {

    private Integer id;

    private PersonaDTO trriFkAnpepersonaid;

    private TiporichiestaDTO trriFkTrtrtiporichiestaid;

    private String trriNote;

    private LocalDate trriDatainizio;

    private LocalDate trriDatafine;

    @Size(max = 50)
    @NotNull
    private String trriSysuser;

    private LocalDate trriSysdate;

    private Integer trriFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonaDTO getTrriFkAnpepersonaid() {
        return trriFkAnpepersonaid;
    }

    public void setTrriFkAnpepersonaid(PersonaDTO trriFkAnpepersonaid) {
        this.trriFkAnpepersonaid = trriFkAnpepersonaid;
    }

    public TiporichiestaDTO getTrriFkTrtrtiporichiestaid() {
        return trriFkTrtrtiporichiestaid;
    }

    public void setTrriFkTrtrtiporichiestaid(TiporichiestaDTO trriFkTrtrtiporichiestaid) {
        this.trriFkTrtrtiporichiestaid = trriFkTrtrtiporichiestaid;
    }

    public String getTrriNote() {
        return trriNote;
    }

    public void setTrriNote(String trriNote) {
        this.trriNote = trriNote;
    }

    public LocalDate getTrriDatainizio() {
        return trriDatainizio;
    }

    public void setTrriDatainizio(LocalDate trriDatainizio) {
        this.trriDatainizio = trriDatainizio;
    }

    public LocalDate getTrriDatafine() {
        return trriDatafine;
    }

    public void setTrriDatafine(LocalDate trriDatafine) {
        this.trriDatafine = trriDatafine;
    }

    public String getTrriSysuser() {
        return trriSysuser;
    }

    public void setTrriSysuser(String trriSysuser) {
        this.trriSysuser = trriSysuser;
    }

    public LocalDate getTrriSysdate() {
        return trriSysdate;
    }

    public void setTrriSysdate(LocalDate trriSysdate) {
        this.trriSysdate = trriSysdate;
    }

    public Integer getTrriFlagAttiva() {
        return trriFlagAttiva;
    }

    public void setTrriFlagAttiva(Integer trriFlagAttiva) {
        this.trriFlagAttiva = trriFlagAttiva;
    }
}
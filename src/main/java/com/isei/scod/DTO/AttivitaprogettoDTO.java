package com.isei.scod.DTO;

import com.isei.scod.Entity.CoapTipoattivitaprogetto;
import com.isei.scod.Entity.PrprProgetto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class AttivitaprogettoDTO {

    private Integer id;

    private ProgettoDTO pratFkPrprprogettoid;

    private TipoattivitaprogettoDTO pratFkCoapattivitaprogettoid;

    private LocalDate pratDatainizio;

    private LocalDate pratDatafine;

    @Size(max = 100)
    private String pratNote;

    @Size(max = 50)
    @NotNull
    private String pratSysuser;

    private LocalDate pratSysdate;

    private Integer pratFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProgettoDTO getPratFkPrprprogettoid() {
        return pratFkPrprprogettoid;
    }

    public void setPratFkPrprprogettoid(ProgettoDTO pratFkPrprprogettoid) {
        this.pratFkPrprprogettoid = pratFkPrprprogettoid;
    }

    public TipoattivitaprogettoDTO getPratFkCoapattivitaprogettoid() {
        return pratFkCoapattivitaprogettoid;
    }

    public void setPratFkCoapattivitaprogettoid(TipoattivitaprogettoDTO pratFkCoapattivitaprogettoid) {
        this.pratFkCoapattivitaprogettoid = pratFkCoapattivitaprogettoid;
    }

    public LocalDate getPratDatainizio() {
        return pratDatainizio;
    }

    public void setPratDatainizio(LocalDate pratDatainizio) {
        this.pratDatainizio = pratDatainizio;
    }

    public LocalDate getPratDatafine() {
        return pratDatafine;
    }

    public void setPratDatafine(LocalDate pratDatafine) {
        this.pratDatafine = pratDatafine;
    }

    public String getPratNote() {
        return pratNote;
    }

    public void setPratNote(String pratNote) {
        this.pratNote = pratNote;
    }

    public String getPratSysuser() {
        return pratSysuser;
    }

    public void setPratSysuser(String pratSysuser) {
        this.pratSysuser = pratSysuser;
    }

    public LocalDate getPratSysdate() {
        return pratSysdate;
    }

    public void setPratSysdate(LocalDate pratSysdate) {
        this.pratSysdate = pratSysdate;
    }

    public Integer getPratFlagAttiva() {
        return pratFlagAttiva;
    }

    public void setPratFlagAttiva(Integer pratFlagAttiva) {
        this.pratFlagAttiva = pratFlagAttiva;
    }
}
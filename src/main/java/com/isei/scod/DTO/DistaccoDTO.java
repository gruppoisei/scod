package com.isei.scod.DTO;

import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Entity.AnsoSocieta;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class DistaccoDTO {

    private Integer id;

    private AnpePersona codsFkAnpepersonaid;

    private AnsoSocieta codsSocietadistaccoid;

    private Integer codsValoredistacco;

    private Integer codsClienteid;

    private LocalDate codsDatainiziodistacco;

    private LocalDate codsDatafinedistacco;

    @Size(max = 50)
    @NotNull
    private String codsSysuser;

    private LocalDate codsSysdate;

    @NotNull
    private Integer codsFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnpePersona getCodsFkAnpepersonaid() {
        return codsFkAnpepersonaid;
    }

    public void setCodsFkAnpepersonaid(AnpePersona codsFkAnpepersonaid) {
        this.codsFkAnpepersonaid = codsFkAnpepersonaid;
    }

    public AnsoSocieta getCodsSocietadistaccoid() {
        return codsSocietadistaccoid;
    }

    public void setCodsSocietadistaccoid(AnsoSocieta codsSocietadistaccoid) {
        this.codsSocietadistaccoid = codsSocietadistaccoid;
    }

    public Integer getCodsValoredistacco() {
        return codsValoredistacco;
    }

    public void setCodsValoredistacco(Integer codsValoredistacco) {
        this.codsValoredistacco = codsValoredistacco;
    }

    public Integer getCodsClienteid() {
        return codsClienteid;
    }

    public void setCodsClienteid(Integer codsClienteid) {
        this.codsClienteid = codsClienteid;
    }

    public LocalDate getCodsDatainiziodistacco() {
        return codsDatainiziodistacco;
    }

    public void setCodsDatainiziodistacco(LocalDate codsDatainiziodistacco) {
        this.codsDatainiziodistacco = codsDatainiziodistacco;
    }

    public LocalDate getCodsDatafinedistacco() {
        return codsDatafinedistacco;
    }

    public void setCodsDatafinedistacco(LocalDate codsDatafinedistacco) {
        this.codsDatafinedistacco = codsDatafinedistacco;
    }

    public String getCodsSysuser() {
        return codsSysuser;
    }

    public void setCodsSysuser(String codsSysuser) {
        this.codsSysuser = codsSysuser;
    }

    public LocalDate getCodsSysdate() {
        return codsSysdate;
    }

    public void setCodsSysdate(LocalDate codsSysdate) {
        this.codsSysdate = codsSysdate;
    }

    public Integer getCodsFlagAttiva() {
        return codsFlagAttiva;
    }

    public void setCodsFlagAttiva(Integer codsFlagAttiva) {
        this.codsFlagAttiva = codsFlagAttiva;
    }
}

package com.isei.scod.Entity;

import jakarta.persistence.*;
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
@Table(name = "CODS_DISTACCO")
public class CodsDistacco implements Serializable {
    private static final long serialVersionUID = 7857026474452210104L;
    @Id
    @Column(name = "CODS_DISTACCOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODS_FK_ANPEPERSONAID")
    private AnpePersona codsFkAnpepersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODS_SOCIETADISTACCOID")
    private AnsoSocieta codsSocietadistaccoid;

    @Column(name = "CODS_VALOREDISTACCO")
    private Integer codsValoredistacco;

    @Column(name = "CODS_CLIENTEID")
    private Integer codsClienteid;

    @Column(name = "CODS_DATAINIZIODISTACCO")
    private LocalDate codsDatainiziodistacco;

    @Column(name = "CODS_DATAFINEDISTACCO")
    private LocalDate codsDatafinedistacco;

    @Size(max = 50)
    @NotNull
    @Column(name = "CODS_SYSUSER", nullable = false, length = 50)
    private String codsSysuser;

    @Column(name = "CODS_SYSDATE")
    private LocalDate codsSysdate;

    @NotNull
    @Column(name = "CODS_FLAG_ATTIVA", nullable = false)
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
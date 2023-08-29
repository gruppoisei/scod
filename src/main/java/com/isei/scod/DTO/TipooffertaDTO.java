package com.isei.scod.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class TipooffertaDTO {

    private Integer id;

    @Size(max = 255)
    private String oftiOffertadesc;

    @Size(max = 50)
    @NotNull
    private String oftiSysuser;

    private LocalDate oftiSysdate;

    private Integer oftiFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOftiOffertadesc() {
        return oftiOffertadesc;
    }

    public void setOftiOffertadesc(String oftiOffertadesc) {
        this.oftiOffertadesc = oftiOffertadesc;
    }

    public String getOftiSysuser() {
        return oftiSysuser;
    }

    public void setOftiSysuser(String oftiSysuser) {
        this.oftiSysuser = oftiSysuser;
    }

    public LocalDate getOftiSysdate() {
        return oftiSysdate;
    }

    public void setOftiSysdate(LocalDate oftiSysdate) {
        this.oftiSysdate = oftiSysdate;
    }

    public Integer getOftiFlagAttiva() {
        return oftiFlagAttiva;
    }

    public void setOftiFlagAttiva(Integer oftiFlagAttiva) {
        this.oftiFlagAttiva = oftiFlagAttiva;
    }
}
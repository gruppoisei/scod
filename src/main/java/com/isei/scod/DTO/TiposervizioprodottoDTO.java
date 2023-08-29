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
public class TiposervizioprodottoDTO {
    private Integer id;

    @Size(max = 255)
    private String orspProdservnome;

    @Size(max = 50)
    @NotNull
    private String orspSysuser;

    private LocalDate orspSysdate;

    private Integer orspFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrspProdservnome() {
        return orspProdservnome;
    }

    public void setOrspProdservnome(String orspProdservnome) {
        this.orspProdservnome = orspProdservnome;
    }

    public String getOrspSysuser() {
        return orspSysuser;
    }

    public void setOrspSysuser(String orspSysuser) {
        this.orspSysuser = orspSysuser;
    }

    public LocalDate getOrspSysdate() {
        return orspSysdate;
    }

    public void setOrspSysdate(LocalDate orspSysdate) {
        this.orspSysdate = orspSysdate;
    }

    public Integer getOrspFlagAttiva() {
        return orspFlagAttiva;
    }

    public void setOrspFlagAttiva(Integer orspFlagAttiva) {
        this.orspFlagAttiva = orspFlagAttiva;
    }
}
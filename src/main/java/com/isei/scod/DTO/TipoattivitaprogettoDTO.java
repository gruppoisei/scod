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
public class TipoattivitaprogettoDTO {

    private Integer id;

    @Size(max = 255)
    @NotNull
    private String coapTipoattprogdesc;

    @Size(max = 50)
    @NotNull
    private String coapSysuser;

    private LocalDate coapSysdate;

    private Integer coapFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoapTipoattprogdesc() {
        return coapTipoattprogdesc;
    }

    public void setCoapTipoattprogdesc(String coapTipoattprogdesc) {
        this.coapTipoattprogdesc = coapTipoattprogdesc;
    }

    public String getCoapSysuser() {
        return coapSysuser;
    }

    public void setCoapSysuser(String coapSysuser) {
        this.coapSysuser = coapSysuser;
    }

    public LocalDate getCoapSysdate() {
        return coapSysdate;
    }

    public void setCoapSysdate(LocalDate coapSysdate) {
        this.coapSysdate = coapSysdate;
    }

    public Integer getCoapFlagAttiva() {
        return coapFlagAttiva;
    }

    public void setCoapFlagAttiva(Integer coapFlagAttiva) {
        this.coapFlagAttiva = coapFlagAttiva;
    }
}
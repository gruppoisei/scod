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
public class TiponotificaDTO {
    private Integer id;

    @Size(max = 100)
    @NotNull
    private String notnTnotdesc;

    @Size(max = 50)
    @NotNull
    private String notnSysuser;

    private LocalDate notnSysdate;

    private Integer notnFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotnTnotdesc() {
        return notnTnotdesc;
    }

    public void setNotnTnotdesc(String notnTnotdesc) {
        this.notnTnotdesc = notnTnotdesc;
    }

    public String getNotnSysuser() {
        return notnSysuser;
    }

    public void setNotnSysuser(String notnSysuser) {
        this.notnSysuser = notnSysuser;
    }

    public LocalDate getNotnSysdate() {
        return notnSysdate;
    }

    public void setNotnSysdate(LocalDate notnSysdate) {
        this.notnSysdate = notnSysdate;
    }

    public Integer getNotnFlagAttiva() {
        return notnFlagAttiva;
    }

    public void setNotnFlagAttiva(Integer notnFlagAttiva) {
        this.notnFlagAttiva = notnFlagAttiva;
    }
}
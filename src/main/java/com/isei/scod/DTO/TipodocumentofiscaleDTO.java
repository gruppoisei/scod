package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class TipodocumentofiscaleDTO {

    private Integer id;

    @Size(max = 100)
    private String ortdTipodesc;

    @Size(max = 50)
    @NotNull
    private String ortdSysuser;

    private LocalDate ortdSysdate;

    private Integer ortdFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrtdTipodesc() {
        return ortdTipodesc;
    }

    public void setOrtdTipodesc(String ortdTipodesc) {
        this.ortdTipodesc = ortdTipodesc;
    }

    public String getOrtdSysuser() {
        return ortdSysuser;
    }

    public void setOrtdSysuser(String ortdSysuser) {
        this.ortdSysuser = ortdSysuser;
    }

    public LocalDate getOrtdSysdate() {
        return ortdSysdate;
    }

    public void setOrtdSysdate(LocalDate ortdSysdate) {
        this.ortdSysdate = ortdSysdate;
    }

    public Integer getOrtdFlagAttiva() {
        return ortdFlagAttiva;
    }

    public void setOrtdFlagAttiva(Integer ortdFlagAttiva) {
        this.ortdFlagAttiva = ortdFlagAttiva;
    }
}
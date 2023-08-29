package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class TiporichiestaDTO {

    private Integer id;

    @Size(max = 100)
    private String trtrTiporichiestadesc;

    @Size(max = 50)
    @NotNull
    private String trtrSysuser;

    private LocalDate trtrSysdate;

    private Integer trtrFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrtrTiporichiestadesc() {
        return trtrTiporichiestadesc;
    }

    public void setTrtrTiporichiestadesc(String trtrTiporichiestadesc) {
        this.trtrTiporichiestadesc = trtrTiporichiestadesc;
    }

    public String getTrtrSysuser() {
        return trtrSysuser;
    }

    public void setTrtrSysuser(String trtrSysuser) {
        this.trtrSysuser = trtrSysuser;
    }

    public LocalDate getTrtrSysdate() {
        return trtrSysdate;
    }

    public void setTrtrSysdate(LocalDate trtrSysdate) {
        this.trtrSysdate = trtrSysdate;
    }

    public Integer getTrtrFlagAttiva() {
        return trtrFlagAttiva;
    }

    public void setTrtrFlagAttiva(Integer trtrFlagAttiva) {
        this.trtrFlagAttiva = trtrFlagAttiva;
    }
}
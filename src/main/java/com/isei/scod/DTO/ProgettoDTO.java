package com.isei.scod.DTO;

import com.isei.scod.Entity.CotiTipocommessa;
import com.isei.scod.Entity.OrdiOrdine;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class ProgettoDTO {

    private Integer id;

    private OrdineDTO prprFkOrdiordineid;

    private TipocommessaDTO tipoTipocommessaid;

    @Size(max = 255)
    @NotNull
    private String prprNome;

    @Size(max = 50)
    @NotNull
    private String prprSysuser;

    private LocalDate prprSysdate;

    private Integer prprFlagAttiva;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrdineDTO getPrprFkOrdiordineid() {
        return prprFkOrdiordineid;
    }

    public void setPrprFkOrdiordineid(OrdineDTO prprFkOrdiordineid) {
        this.prprFkOrdiordineid = prprFkOrdiordineid;
    }

    public TipocommessaDTO getTipoTipocommessaid() {
        return tipoTipocommessaid;
    }

    public void setTipoTipocommessaid(TipocommessaDTO tipoTipocommessaid) {
        this.tipoTipocommessaid = tipoTipocommessaid;
    }

    public String getPrprNome() {
        return prprNome;
    }

    public void setPrprNome(String prprNome) {
        this.prprNome = prprNome;
    }

    public String getPrprSysuser() {
        return prprSysuser;
    }

    public void setPrprSysuser(String prprSysuser) {
        this.prprSysuser = prprSysuser;
    }

    public LocalDate getPrprSysdate() {
        return prprSysdate;
    }

    public void setPrprSysdate(LocalDate prprSysdate) {
        this.prprSysdate = prprSysdate;
    }

    public Integer getPrprFlagAttiva() {
        return prprFlagAttiva;
    }

    public void setPrprFlagAttiva(Integer prprFlagAttiva) {
        this.prprFlagAttiva = prprFlagAttiva;
    }
}
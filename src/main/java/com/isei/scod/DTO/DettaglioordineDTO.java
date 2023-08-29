package com.isei.scod.DTO;

import com.isei.scod.Entity.OrdiOrdine;
import com.isei.scod.Entity.OrspTiposervizioprodotto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class DettaglioordineDTO  {

    private Integer id;

    private TiposervizioprodottoDTO ordoFkOrsptipoprodservid;

    private OrdineDTO ordoFkOrdiordineid;

    @Size(max = 600)
    private String ordoProdservdesc;

    @Size(max = 600)
    private String ordoNote;

    private BigDecimal ordoCosto;

    private Integer ordoQuantita;

    @Size(max = 50)
    @NotNull
    private String ordoSysuser;

    private LocalDate ordoSysdate;

    private Integer ordoFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TiposervizioprodottoDTO getOrdoFkOrsptipoprodservid() {
        return ordoFkOrsptipoprodservid;
    }

    public void setOrdoFkOrsptipoprodservid(TiposervizioprodottoDTO ordoFkOrsptipoprodservid) {
        this.ordoFkOrsptipoprodservid = ordoFkOrsptipoprodservid;
    }

    public OrdineDTO getOrdoFkOrdiordineid() {
        return ordoFkOrdiordineid;
    }

    public void setOrdoFkOrdiordineid(OrdineDTO ordoFkOrdiordineid) {
        this.ordoFkOrdiordineid = ordoFkOrdiordineid;
    }

    public String getOrdoProdservdesc() {
        return ordoProdservdesc;
    }

    public void setOrdoProdservdesc(String ordoProdservdesc) {
        this.ordoProdservdesc = ordoProdservdesc;
    }

    public String getOrdoNote() {
        return ordoNote;
    }

    public void setOrdoNote(String ordoNote) {
        this.ordoNote = ordoNote;
    }

    public BigDecimal getOrdoCosto() {
        return ordoCosto;
    }

    public void setOrdoCosto(BigDecimal ordoCosto) {
        this.ordoCosto = ordoCosto;
    }

    public Integer getOrdoQuantita() {
        return ordoQuantita;
    }

    public void setOrdoQuantita(Integer ordoQuantita) {
        this.ordoQuantita = ordoQuantita;
    }

    public String getOrdoSysuser() {
        return ordoSysuser;
    }

    public void setOrdoSysuser(String ordoSysuser) {
        this.ordoSysuser = ordoSysuser;
    }

    public LocalDate getOrdoSysdate() {
        return ordoSysdate;
    }

    public void setOrdoSysdate(LocalDate ordoSysdate) {
        this.ordoSysdate = ordoSysdate;
    }

    public Integer getOrdoFlagAttiva() {
        return ordoFlagAttiva;
    }

    public void setOrdoFlagAttiva(Integer ordoFlagAttiva) {
        this.ordoFlagAttiva = ordoFlagAttiva;
    }
}
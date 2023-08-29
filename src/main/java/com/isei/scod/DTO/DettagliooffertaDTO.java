package com.isei.scod.DTO;

import com.isei.scod.Entity.OffeOfferta;
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
public class DettagliooffertaDTO  {

    private Integer id;

    private TiposervizioprodottoDTO ordeFkOrsptipoprodservid;

    private OffertaDTO ordeFkOffeoffertaid;

    @Size(max = 600)
    private String ordeProdservdesc;

    @Size(max = 600)
    private String ordeNote;

    private BigDecimal ordeCosto;

    private Integer ordeQuantita;

    @Size(max = 50)
    @NotNull
    private String ordeSysuser;

    private LocalDate ordeSysdate;

    private Integer ordaFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TiposervizioprodottoDTO getOrdeFkOrsptipoprodservid() {
        return ordeFkOrsptipoprodservid;
    }

    public void setOrdeFkOrsptipoprodservid(TiposervizioprodottoDTO ordeFkOrsptipoprodservid) {
        this.ordeFkOrsptipoprodservid = ordeFkOrsptipoprodservid;
    }

    public OffertaDTO getOrdeFkOffeoffertaid() {
        return ordeFkOffeoffertaid;
    }

    public void setOrdeFkOffeoffertaid(OffertaDTO ordeFkOffeoffertaid) {
        this.ordeFkOffeoffertaid = ordeFkOffeoffertaid;
    }

    public String getOrdeProdservdesc() {
        return ordeProdservdesc;
    }

    public void setOrdeProdservdesc(String ordeProdservdesc) {
        this.ordeProdservdesc = ordeProdservdesc;
    }

    public String getOrdeNote() {
        return ordeNote;
    }

    public void setOrdeNote(String ordeNote) {
        this.ordeNote = ordeNote;
    }

    public BigDecimal getOrdeCosto() {
        return ordeCosto;
    }

    public void setOrdeCosto(BigDecimal ordeCosto) {
        this.ordeCosto = ordeCosto;
    }

    public Integer getOrdeQuantita() {
        return ordeQuantita;
    }

    public void setOrdeQuantita(Integer ordeQuantita) {
        this.ordeQuantita = ordeQuantita;
    }

    public String getOrdeSysuser() {
        return ordeSysuser;
    }

    public void setOrdeSysuser(String ordeSysuser) {
        this.ordeSysuser = ordeSysuser;
    }

    public LocalDate getOrdeSysdate() {
        return ordeSysdate;
    }

    public void setOrdeSysdate(LocalDate ordeSysdate) {
        this.ordeSysdate = ordeSysdate;
    }

    public Integer getOrdaFlagAttiva() {
        return ordaFlagAttiva;
    }

    public void setOrdaFlagAttiva(Integer ordaFlagAttiva) {
        this.ordaFlagAttiva = ordaFlagAttiva;
    }
}